package com.example.help_kiosk.foodList.coffeeList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.help_kiosk.R;
import com.example.help_kiosk.foodList.coffeeList.bbacks.bbacks;
import com.example.help_kiosk.foodList.coffeeList.coffeebean.coffeebean;
import com.example.help_kiosk.foodList.coffeeList.compose.compose;
import com.example.help_kiosk.foodList.coffeeList.ediya.ediya;
import com.example.help_kiosk.foodList.coffeeList.hollys.hollys;
import com.example.help_kiosk.foodList.coffeeList.mega.mega;
import com.example.help_kiosk.foodList.coffeeList.pascucci.pascucci;
import com.example.help_kiosk.foodList.coffeeList.starbucks.starbucks;
import com.example.help_kiosk.foodList.coffeeList.twosome.twosome;

public class coffee extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_coffee);

        //빽다방 커피 버튼 클릭시
        Button bback_button = (Button) findViewById(R.id.bbacks_button);
        bback_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), bbacks.class);
                startActivity(intent);
            }
        });

        //커피빈 커피 버튼 클릭시
        Button bean_button = (Button) findViewById(R.id.coffeebean_button);
        bean_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), coffeebean.class);
                startActivity(intent);
            }
        });

        //컴포즈 커피 버튼 클릭시
        Button com_button = (Button) findViewById(R.id.compose_button);
        com_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), compose.class);
                startActivity(intent);
            }
        });

        //이디야 커피 버튼 클릭시
        Button edi_button = (Button) findViewById(R.id.ediya_button);
        edi_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ediya.class);
                startActivity(intent);
            }
        });

        //할리스 커피 버튼 클릭시
        Button h_button = (Button) findViewById(R.id.hollys_button);
        h_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), hollys.class);
                startActivity(intent);
            }
        });

        //메가 커피 버튼 클릭시
        Button m_button = (Button) findViewById(R.id.mega_button);
        m_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mega.class);
                startActivity(intent);
            }
        });

        //파스꾸찌 커피 버튼 클릭시
        Button p_button = (Button) findViewById(R.id.pascucci_button);
        p_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pascucci.class);
                startActivity(intent);
            }
        });

        //스타벅스 커피 버튼 클릭시
        Button star_button = (Button) findViewById(R.id.starbucks_button);
        star_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), starbucks.class);
                startActivity(intent);
            }
        });

        //투썸 커피 버튼 클릭시
        Button two_button = (Button) findViewById(R.id.twosome_button);
        two_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), twosome.class);
                startActivity(intent);
            }
        });
    }
}
