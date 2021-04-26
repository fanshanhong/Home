package com.fan.componentization.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fan.componentization.module_home.HomeMainActivity;

@Route(path = "/home/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this,"MainActivity", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, HomeMainActivity.class));
    }
}