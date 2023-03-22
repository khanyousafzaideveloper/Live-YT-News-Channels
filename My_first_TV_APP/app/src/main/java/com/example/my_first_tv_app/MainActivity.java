package com.example.my_first_tv_app;


import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements View.OnClickListener, View.OnFocusChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2 = findViewById(R.id.button2);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b3 = findViewById(R.id.button3);
        Button b7 = findViewById(R.id.button7);

        b2.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b3.setOnClickListener(this);
        b7.setOnClickListener(this);

        b2.setOnFocusChangeListener(this);
        b4.setOnFocusChangeListener(this);
        b5.setOnFocusChangeListener(this);
        b6.setOnFocusChangeListener(this);
        b3.setOnFocusChangeListener(this);
        b7.setOnFocusChangeListener(this);

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
            case R.id.button3:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=dZvHWVKY-AQ"));
                startActivity(intent);
                break;
            case R.id.button7:
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=O3DPVlynUM0"));
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onFocusChange(View v, boolean b) {
        if (b) {
            v.setScaleX(1.04f);
            v.setScaleY(1.04f);
        }else {
            v.setScaleX(1.0f);
            v.setScaleY(1.0f);
        }
    }
}

