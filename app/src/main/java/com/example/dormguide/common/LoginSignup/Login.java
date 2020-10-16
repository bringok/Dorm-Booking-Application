package com.example.dormguide.common.LoginSignup;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dormguide.R;
import com.example.dormguide.User.UserDashboard;
import com.example.dormguide.common.FeedBack;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    TextInputLayout email, password;
    Button btn;
    ProgressBar progressBar;
    FirebaseAuth fAuth;
    Button forgetPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_login);

        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        btn = findViewById(R.id.login_btn);
        progressBar = findViewById(R.id.progress_bar);
        fAuth = FirebaseAuth.getInstance();
        forgetPass = findViewById(R.id.btnUserForgetPass);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _email = email.getEditText().getText().toString().trim();
                String _password = password.getEditText().getText().toString().trim();

                if (TextUtils.isEmpty(_email)) {
                    email.setError("Email is required.");
                    return;
                }
                if (TextUtils.isEmpty(_password)) {
                    password.setError("FullName is required.");
                    return;
                }
                if (_password.length() < 6) {
                    password.setError("Password must be more than 6 characters");
                    return;
                }

             //   progressBar.setVisibility(View.VISIBLE);


                fAuth.signInWithEmailAndPassword(_email, _password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Login.this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), UserDashboard.class));
                        } else {
                            Toast.makeText(Login.this, "Wrong email or password" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        //    progressBar.setVisibility(View.GONE);
                            finish();
                        }
                    }
                });
            }
        });
forgetPass.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Login.this,ForgetPasswordActivity.class));
    }
});

    }


    public void back_to_signUp(View view) {
        Intent intent = new Intent(getApplicationContext(),  SignUp.class);
        startActivity(intent);
    }


}