package com.example.lohith.ace;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView title = (ImageView)findViewById(R.id.imageView);
        title.setImageResource(R.drawable.aceicon);
        Button button = (Button)findViewById(R.id.host);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayerScreen.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}