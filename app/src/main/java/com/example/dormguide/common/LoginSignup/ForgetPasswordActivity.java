package com.example.dormguide.common.LoginSignup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.dormguide.R;
import com.example.dormguide.User.UserDashboard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPasswordActivity extends AppCompatActivity {

      ProgressBar progressBar;
    TextInputLayout userEmail;
    Button userPass;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_forget_password2);


        userEmail = findViewById(R.id.etUserEmail);
        userPass = findViewById(R.id.btnForgetPass);

        firebaseAuth = FirebaseAuth.getInstance();

        userPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseAuth.sendPasswordResetEmail(userEmail.getEditText().getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if(task.isSuccessful()){
                            Toast.makeText(ForgetPasswordActivity.this,"Password send to your email",Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(ForgetPasswordActivity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();

                        }

                    }
                });
            }
        });





    }

    public void create_account(View view) {
        Intent intent = new Intent(getApplicationContext(), Login.class);
        startActivity(intent);
    }
}



