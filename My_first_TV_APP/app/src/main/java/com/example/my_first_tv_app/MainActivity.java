package com.example.my_first_tv_app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener, View.OnKeyListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button2);
        Button b2 = findViewById(R.id.button4);
        Button b3 = findViewById(R.id.button5);
        Button b4 = findViewById(R.id.button6);
        b1.setOnClickListener(this);
        b1.setOnKeyListener(this);
        b2.setOnClickListener(this);
        b2.setOnKeyListener(this);
        b3.setOnClickListener(this);
        b3.setOnKeyListener(this);
        b4.setOnClickListener(this);
        b4.setOnKeyListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.button2:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=gCNeDWCI0vo"));
                startActivity(intent);
                break;
            case R.id.button4:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=5VF4aor94gw"));
                startActivity(intent);
                break;
            case R.id.button5:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=gYUfs9RX95s"));
                startActivity(intent);
                break;
            case R.id.button6:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=9Auq9mYxFEE"));
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN) {
            v.setScaleX(1.5f);
            v.setScaleY(1.5f);
            return true; // consume the event
        }

        return false; // let the event propagate to other listeners
    }
}

