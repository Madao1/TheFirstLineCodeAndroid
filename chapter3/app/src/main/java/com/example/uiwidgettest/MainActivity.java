package com.example.uiwidgettest;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        editText = (EditText) findViewById(R.id.edit_text);

        imageView = (ImageView) findViewById(R.id.image_view);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.drawable.img_2);
//                if(progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
            }
        });
    }
}