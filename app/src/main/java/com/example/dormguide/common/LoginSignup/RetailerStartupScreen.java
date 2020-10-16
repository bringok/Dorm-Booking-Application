package com.example.dormguide.common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dormguide.R;

public class RetailerStartupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_startup_screen);

    }

    public void callLoginScreen(View view) {

        Intent intent = new Intent(getApplicationContext(), Login.class);


            startActivity(intent);
        }


    public void callSignupScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUp.class);
        startActivity(intent);
    }
}
