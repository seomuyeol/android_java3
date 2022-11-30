package com.example.applicationexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class constActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tv_result;
    private Button btn_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        // 결과 버튼을 클릭 했을 때
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}