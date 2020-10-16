package com.example.dormguide.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.dormguide.R;

public class FeedBack extends AppCompatActivity {

  private   EditText ouremail, subject, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_feed_back);

        ouremail = findViewById(R.id.email);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.btn_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ourSubjectFeedback = subject.getText().toString();
                String ourMessageFeedback = message.getText().toString();
                String ourEmail = ouremail.getText().toString();

                String[] email_divide = ourEmail.split(",");
                Intent send = new Intent(Intent.ACTION_SEND);
                send.putExtra(Intent.EXTRA_EMAIL,email_divide);
                send.putExtra(Intent.EXTRA_SUBJECT,ourSubjectFeedback);
                send.putExtra(Intent.EXTRA_TEXT,ourMessageFeedback);
                send.setType("message/rfc822");
                send.setPackage("com.google.android.gm");
                startActivity(send);

            }
        });
    }
}
