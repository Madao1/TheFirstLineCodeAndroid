package com.example.activitytest;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    /*
    * 项目中的任何活动都应该重写 Activity 的 onCreate() 方法
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        * 这里调用 setContentView() 方法来给当前的活动加载一个布局。
        * 我们一般都会传入一个布局文件的 id。项目中添加的任何资源都会在 R 文件中生成一个相应的资源 id。
        * */
        setContentView(R.layout.first_layout);
        /*
        * 通过 findViewById() 方法获取到在布局文件中定义的元素，
        * findViewById() 方法返回的是一个 View 对象，我们需要向下转型将它转成 Button 对象
        * */
        Button button1 = (Button) findViewById(R.id.button_1);
        /*
        * 为按钮添加一个点击监听器
        * */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * makeText() 方法需要传入3个参数。
                * 第一个参数是 Context，也就是 Toast 要求的上下文，由于活动本身就是一个 Context 对象，这里直接传入 FirstActivity.this
                * 第二个参数是 Toast 显示的文本内容。
                * 第三个参数是 Toast 显示的时长。
                * */
                Toast.makeText(FirstActivity.this, "You clicked Button 1",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}