package com.example.vectorassets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivPic;
    Button btnChange;
    ImageView ivPic2;
    ImageView ivPic3;
    ImageView ivPic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPic = findViewById(R.id.ivPic);
        btnChange = findViewById(R.id.btnChange);
        ivPic2 = findViewById(R.id.ivPic2);
        ivPic3 = findViewById(R.id.ivPic3);
        ivPic4 = findViewById(R.id.ivPic4);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ivPic.setImageResource(R.drawable.cake);

            }
        });
        ivPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ivPic.setImageResource(R.drawable.beach);

            }
        });
        ivPic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPic.setImageResource(R.drawable.beach);
            }
        });
        ivPic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPic.setImageResource(R.drawable.build);
            }
        });
        ivPic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPic.setImageResource(R.drawable.cake);
            }
        });
    }
}
