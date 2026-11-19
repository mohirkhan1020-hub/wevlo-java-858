package com.wevlo.javaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        TextView tv = new TextView(this);
        tv.setText("Built with Wevlo GitHub IDE!");
        tv.setTextSize(20f);

        Button btn = new Button(this);
        btn.setText("Click Me");
        btn.setOnClickListener(v -> Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show());

        layout.addView(tv);
        layout.addView(btn);
        setContentView(layout);
    }
}