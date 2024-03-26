package com.example.smd_signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabItem;

public class IconActivity extends AppCompatActivity {

    ImageButton btnArrow;
    TextView tvDemo;
    TabItem Tabone,Tabtwo,Tabthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        init();

        btnArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(IconActivity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });

    }

    protected void init()
    {
        tvDemo=findViewById(R.id.tvDemo);
        btnArrow=findViewById(R.id.btnArrow);
        Tabone=findViewById(R.id.Tabone);
        Tabtwo=findViewById(R.id.Tabtwo);
        Tabthree=findViewById(R.id.Tabthree);
    }

}