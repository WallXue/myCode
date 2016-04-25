package com.xw.magic;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    HorizontalScrollView scrollView;

    Button testButton;

    Handler handler = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        scrollView = (HorizontalScrollView)this.findViewById(R.id.scrollView);
        testButton = (Button)this.findViewById(R.id.button);
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            float oldx=0;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                    oldx = event.getX();
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    float r = event.getX() - oldx;
                    oldx = 0;
                    if(r > 0) {
                        next();
                    }else if(r<0){
                        pre();
                    }
                }
                return true;
            }
        });
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.smoothScrollTo(200,200);
                    }
                });
            }
        });
    }

    private void next(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                float x = scrollView.getX() + 200;
                scrollView.smoothScrollTo((int)x,0);
            }
        });
    }

    private void pre(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                float x = scrollView.getX() - 200;
                scrollView.smoothScrollTo((int)x,0);
            }
        });
    }
}
