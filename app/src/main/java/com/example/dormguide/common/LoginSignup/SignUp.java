package com.example.dormguide.common.LoginSignup;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dormguide.Databases.UserHelperClass;
import com.example.dormguide.R;
import com.example.dormguide.User.UserDashboard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignUp extends AppCompatActivity {

    TextInputLayout fullName, username, email, password, phoneNo, age;
    Button btn;

    UserHelperClass userHelperClass;
    RadioButton male, female;
    ProgressBar progressBar;


    FirebaseAuth fAuth;

    FirebaseDatabase database;
    DatabaseReference reference;


    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_sign_up);


        fullName = findViewById(R.id.signup_fullname);
        username = findViewById(R.id.signup_username);
        email = findViewById(R.id.signup_email);
        password = findViewById(R.id.signup_password);
        phoneNo = findViewById(R.id.signup_phone_number);
        age = findViewById(R.id.signup_age);
        userHelperClass = new UserHelperClass();
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        fAuth = FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progress_bar);

        btn = findViewById(R.id.signup_next_btn);


        reference = database.getInstance().getReference().child("Users");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {
                    i = (int) dataSnapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String _email = email.getEditText().getText().toString().trim();
                String _password = password.getEditText().getText().toString().trim();
                String _fullName = password.getEditText().getText().toString().trim();
                String _username = password.getEditText().getText().toString().trim();
                String _age = password.getEditText().getText().toString().trim();
                String _phoneNo = password.getEditText().getText().toString().trim();


                String m1 = male.getText().toString();
                String m2 = female.getText().toString();


                if (TextUtils.isEmpty(_password)) {
                    password.setError("Password is required.");
                    return;
                }
              else  if (TextUtils.isEmpty(_email)) {
                    email.setError("Email is required.");
                    return;
                }


                if (_password.length() < 6) {
                    password.setError("Password must be more than 6 characters");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                fAuth.createUserWithEmailAndPassword(_email,_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "User created account", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), UserDashboard.class));
                        } else {
                            Toast.makeText(SignUp.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });


                userHelperClass.setName(fullName.getEditText().getText().toString());
                userHelperClass.setUsername(username.getEditText().getText().toString());
                userHelperClass.setEmail(email.getEditText().getText().toString());
                userHelperClass.setPhoneNo(phoneNo.getEditText().getText().toString());
                userHelperClass.setPassword(password.getEditText().getText().toString());
                userHelperClass.setAge(age.getEditText().getText().toString());


                if (male.isChecked()) {
                    userHelperClass.setGender(m1);
                    reference.child(String.valueOf(i + 1)).setValue(userHelperClass);
                } else {
                    userHelperClass.setGender(m2);
                    reference.child(String.valueOf(i + 1)).setValue(userHelperClass);
                }
            }
        });


    }


    public void back_to_login(View view) {
        Intent intent = new Intent(getApplicationContext(), Login.class);

        startActivity(intent);
    }


}

