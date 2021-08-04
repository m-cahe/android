package com.example.a20210120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    private ImageView img_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        img_view = findViewById(R.id.img_view);    //모든 id는 정수값으로 저장
    }

    public void btnClick(View view){
        Log.v("myValue","버튼을 눌렀습니다");
        Toast.makeText(this, "버튼누름", Toast.LENGTH_SHORT).show();
        img_view.setImageResource(R.drawable.dice2);
    }

}