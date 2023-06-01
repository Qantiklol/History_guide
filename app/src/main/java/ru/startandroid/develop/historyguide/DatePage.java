package ru.startandroid.develop.historyguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class DatePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_page);
    }

    public void goBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void addToLike(View view) {

        int item_id = getIntent().getIntExtra("eraId", 0);
        Like.items_id.add(item_id);
        Toast.makeText(this, "Добавлено! Молодец, что изучаешь историю :)", Toast.LENGTH_LONG).show();
    }
}