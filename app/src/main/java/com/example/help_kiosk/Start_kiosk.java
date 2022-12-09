package com.example.help_kiosk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.help_kiosk.foodList.chicken;
import com.example.help_kiosk.foodList.coffeeList.coffee;
import com.example.help_kiosk.foodList.hamberger;
import com.example.help_kiosk.foodList.kimbab;
import com.example.help_kiosk.foodList.salad;
import com.example.help_kiosk.foodList.soup;

public class Start_kiosk extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_kiosk);

        //커피 버튼 클릭시
        Button c_button = (Button) findViewById(R.id.coffee_button);
        c_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), coffee.class);
                startActivity(intent);
            }
        });

        //햄버거 버튼 클릭시
        Button h_button = (Button) findViewById(R.id.hamberger_button);
        h_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), hamberger.class);
                startActivity(intent);
            }
        });

        //치킨 버튼 클릭시
        Button ch_button = (Button) findViewById(R.id.chicken_button);
        ch_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), chicken.class);
                startActivity(intent);
            }
        });

        //샐러드 버튼 클릭시
        Button s_button = (Button) findViewById(R.id.salad_button);
        s_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), salad.class);
                startActivity(intent);
            }
        });

        //김밥 버튼 클릭시
        Button k_button = (Button) findViewById(R.id.kimbab_button);
        k_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), kimbab.class);
                startActivity(intent);
            }
        });

        //찌개 버튼 클릭시
        Button so_button = (Button) findViewById(R.id.kimchi_button);
        so_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), soup.class);
                startActivity(intent);
            }
        });
    }
}
