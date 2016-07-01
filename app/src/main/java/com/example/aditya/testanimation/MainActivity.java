package com.example.aditya.testanimation;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener
{
    ImageView imgView;
    Button btnAlpha,btnRotate,btnScale,btnTranslate;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView=(ImageView)findViewById(R.id.imgView);

        btnAlpha=(Button)findViewById(R.id.btnAlpha);
        btnScale=(Button)findViewById(R.id.btnScale);
        btnRotate=(Button)findViewById(R.id.btnRotate);
        btnTranslate=(Button)findViewById(R.id.btnTranslate);

        btnAlpha.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnScale.setOnClickListener(this);
        btnTranslate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
      switch(v.getId())
      {
          case R.id.btnAlpha:
              animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
              imgView.startAnimation(animation);
              break;

          case R.id.btnRotate:
              animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
              imgView.startAnimation(animation);
              break;

          case R.id.btnScale:
              animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
              imgView.startAnimation(animation);
              break;

          case R.id.btnTranslate:
              animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
              imgView.startAnimation(animation);
              break;
      }
    }
}
