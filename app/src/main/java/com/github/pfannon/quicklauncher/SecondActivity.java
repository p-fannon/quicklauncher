package com.github.pfannon.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.github.pfannon.quicklauncher.SOMETHING")) {
            TextView displayTextView = findViewById(R.id.displayTextView);
            String display = getIntent().getExtras().getString("com.github.pfannon.quicklauncher.SOMETHING");
            displayTextView.setText(display);
        }
    }
}
