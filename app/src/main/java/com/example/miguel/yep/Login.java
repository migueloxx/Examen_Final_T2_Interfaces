package com.example.miguel.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = (Button)findViewById(R.id.btn_login);

        TextView text = (TextView)findViewById(R.id.textView2);
        TextView text2 = (TextView)findViewById(R.id.textView3);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        text.setTypeface(myFont);
        text2.setTypeface(myFont);


        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Login.this,  MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
