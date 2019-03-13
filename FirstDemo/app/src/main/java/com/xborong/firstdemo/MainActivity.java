package com.xborong.firstdemo;

import android.Manifest;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Button button1 = findViewById(R.id.button_1);
        final String title = "点它";
        button1.setText(title);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button)v;
                if (btn.getText().equals(title)) {
                    btn.setText("再点啊！");
                } else {
                    btn.setText(title);
                }
                MainActivity.this.setTitle("你被点了！");
                Toast.makeText(MainActivity.this, "成功了！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
