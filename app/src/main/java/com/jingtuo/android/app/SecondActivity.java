package com.jingtuo.android.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri!=null) {
            textView.setText("second:" + uri.getScheme() + "://" + uri.getHost() + uri.getPath());
        }
    }
}
