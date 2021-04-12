package com.chat.colour;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.a4455jkjh.colorpicker.ColorPickerDialog;

public class MainActivity extends AppCompatActivity {
    private  ColorPickerDialog colorPickerDialog;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.a1);
        colorPickerDialog =new ColorPickerDialog(this, Color.RED);//第二个参数为初始颜色
        colorPickerDialog.setTitle("测试标题");//这里设置标题
        colorPickerDialog.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener() {//设置点击事件
            @Override
            public void onColorChanged(int i) {
                textView.setTextColor(i);//返回选择的颜色，整数型.
            }
        });
        colorPickerDialog.show();//显示对话框
        //colorPickerDialog.dismiss();//关闭对话框 onColorChanged事件中会自动关闭，可重写onClick方法自行处理

    }








}