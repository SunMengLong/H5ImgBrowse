package com.h5.img.browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_start).setOnClickListener(new OnClickListener());
    }

    class OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,NewsViewPagerActivity.class));
            overridePendingTransition(0, 0);
        }
    }

}
