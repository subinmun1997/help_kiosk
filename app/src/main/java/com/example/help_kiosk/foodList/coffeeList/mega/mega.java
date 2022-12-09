package com.example.help_kiosk.foodList.coffeeList.mega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.help_kiosk.R;
import com.example.help_kiosk.foodList.coffeeList.bbacks.bbacks;
import com.example.help_kiosk.foodList.coffeeList.mega.takein.takeIn;
import com.example.help_kiosk.foodList.coffeeList.mega.takeout.takeOut;

public class mega extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_menu_mega);

        //먹고가기 버튼 클릭시
        Button takein_button = (Button) findViewById(R.id.takein_button);
        takein_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), takeIn.class);
                startActivity(intent);
            }
        });

        //포장하기 버튼 클릭시
        Button takeout_button = (Button) findViewById(R.id.takeout_button);
        takeout_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), takeOut.class);
                startActivity(intent);
            }
        });
    }
}
