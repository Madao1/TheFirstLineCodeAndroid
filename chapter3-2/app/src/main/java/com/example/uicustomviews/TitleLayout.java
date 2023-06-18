package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        /*
        * The context is used to get an instance of LayoutInflater via the from(Context) method.
        * The LayoutInflater needs the context to access system services and to inflate views from XML layout files.
        * */
        LayoutInflater.from(context).inflate(R.layout.title, this);

        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked Edit button",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
