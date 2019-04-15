package com.mavenir.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mavenir.library.Utils;

public class MainActivity extends AppCompatActivity {


    private Button helloBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloBtn = (Button)findViewById(R.id.btn);
        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.sayHello(MainActivity.this,"Hello Library!");
            }
        });
    }
}
