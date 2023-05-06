package com.example.app0126;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    // onCreate() : 앱이 처음 실행됐을 때 화면(XML)을 생성하는 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 화면을 뭘로 지정할거냐 -> activity_main
        
        // ★findViewById(R.id.view의 id값) : 화면에 배치된 View의 객체정보를 가져오는 메소드
        txt = findViewById(R.id.txt);

        // View의 text속성값을 가져오는 메소드
        String data = txt.getText().toString();

        // Log클래스 : 앱에서 발생된 값들을 확인하기 위한 클래스
        // 종류 : i(info), w(warning), v(verbose), debug, e(error)
        // -> Logcat 도구를 이용해서 조회
        // -> Run도구에서도 확인가능(앱을 확인했을 때만 활성화)
        Log.d("[MainActivity]",data);

        // View의 text 속성값을 변경하는 메소드
        txt.setText(":3c");
        // View의 배경색을 변경하는 메소드
        txt.setBackgroundColor(Color.parseColor("#607F3E"));
        // View의 글자색을 변경하는 메소드
        txt.setTextColor(Color.parseColor("#F5F3EC"));
    }
}