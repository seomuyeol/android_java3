package com.example.applicationexam;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_play;
    private Button btn_stop;
    private Button btn_const;

    MediaPlayer mediaPlayer;

    // activity 종료 시 실행
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null ) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = (Button) findViewById(R.id.btn_play);
        btn_stop = (Button) findViewById(R.id.btn_stop);
        btn_const = (Button) findViewById(R.id.btn_const);

        // 재생 눌렀을 때
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gentleman);
                mediaPlayer.start();
            }
        });

        // 스탑 버튼
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                }
            }
        });

        btn_const.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_const);
            }
        });
    }
}