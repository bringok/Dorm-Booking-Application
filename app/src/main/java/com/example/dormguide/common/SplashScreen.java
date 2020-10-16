package com.example.dormguide.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dormguide.R;
import com.example.dormguide.common.LoginSignup.RetailerStartupScreen;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 3000;
 //variables
    ImageView backgroundImage;
    TextView poweredByLine;

    //animation
    Animation sideAnim,bottomAnim;
   // SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //Hooks

        backgroundImage = findViewById(R.id.background_image);
        poweredByLine = findViewById(R.id.powered_by_line);

        //animation

        sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        //Set animation on elements
        backgroundImage.setAnimation(sideAnim);
        poweredByLine.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//onBoardingScreen = getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
//boolean isFirstTime= onBoardingScreen.getBoolean("firsttime",true);

//if(isFirstTime){

    //SharedPreferences.Editor editor = RetailerStartupScreen.edit();
//    editor.putBoolean("firsttime",false);
//    editor.commit();

    Intent intent = new Intent(getApplicationContext(), OnBoarding.class);
    startActivity(intent);
    finish();

//}
//else{
//    Intent intent = new Intent(getApplicationContext(), RetailerStartupScreen.class);
//    startActivity(intent);
//    finish();
//}


            }
        },SPLASH_TIMER);
    }
}
