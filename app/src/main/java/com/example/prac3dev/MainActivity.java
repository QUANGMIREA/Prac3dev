package com.example.prac3dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        setContentView(R.layout.activity_main);
//        TextView textView = new TextView(this);
//        textView.setText("Hello world");
//        textView.setTextSize(26);
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ViewGroup.LayoutParams.MATCH_PARENT;
//        layoutParams.topToTop = ViewGroup.LayoutParams.MATCH_PARENT;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout);
        setContentView(R.layout.second_layout);
        TextView textView = findViewById(R.id.header);
        textView.setText("Hello from JAVA");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        textView2.setText(String.valueOf(height));
        textView3.setText(String.valueOf(width));
        Resources resources = this.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 48, metrics);









    }
}