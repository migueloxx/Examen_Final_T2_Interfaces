package com.example.miguel.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp(true);

        TextView text = (TextView)findViewById(R.id.textView4);
       TextView text2 = (TextView)findViewById(R.id.textView5);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        text.setTypeface(myFont);
        text2.setTypeface(myFont);

      /*  Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        Splash.startAnimation(shake);*/

    }

    private static void startAnimation(Animation shake) {

    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
