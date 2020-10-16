package com.example.dormguide.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dormguide.R;

import com.example.dormguide.Roomss.MainActivity;
import com.example.dormguide.Roomss2.Main2Activity;
import com.example.dormguide.Roomss2.Main3Activity;
import com.example.dormguide.Roomss2.Main4Activity;
import com.example.dormguide.common.FeedBack;
import com.example.dormguide.common.LoginSignup.Login;
import com.google.firebase.auth.FirebaseAuth;

public class UserDashboard extends AppCompatActivity {


    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        drawerLayout = findViewById(R.id.drawer_layout);

    }


    public void medium_room(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }

    public void large_room(View view) {
        Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(intent);
    }

    public void double_room(View view) {
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(intent);
    }


    public void small_room(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void feedback(View view) {
        Intent intent = new Intent(getApplicationContext(),  FeedBack.class);
        startActivity(intent);
    }
}


