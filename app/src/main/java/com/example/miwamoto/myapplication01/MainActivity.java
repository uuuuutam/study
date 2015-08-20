package com.example.miwamoto.myapplication01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getOmikuji(View view) {
        // TextViewの取得
        TextView tv = (TextView)findViewById(R.id.myTextView);
        String[] results =  {
            "大吉",
            "吉",
            "凶"
        };
        // 乱数の生成
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(results.length); // 0~2のどれかを返す

        // 大吉を赤文字として指定する
        if ( num == 0 ){
            tv.setTextColor(Color.RED);
        } else {
            tv.setTextColor(Color.rgb(0, 0, 0));
        }
        // 結果の表示
//        String result = Integer.toString(num);
        tv.setText(results[num]);
    }
}
