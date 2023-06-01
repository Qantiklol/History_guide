package ru.startandroid.develop.historyguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class EraPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_era_page);

        ConstraintLayout eraBg = findViewById(R.id.eraPageBg);
        ImageView eraImage = findViewById(R.id.eraPageImage);
        TextView eraTitle = findViewById(R.id.eraPageTitle);
        TextView eraStartDate = findViewById(R.id.eraPageStart);
        TextView eraEndDate = findViewById(R.id.eraPageEnd);
        TextView eraText = findViewById(R.id.EraPageText);

        eraBg.setBackgroundColor(getIntent().getIntExtra("eraBg", 0));
        eraImage.setImageResource(getIntent().getIntExtra("eraImage", 0));
        eraTitle.setText(getIntent().getStringExtra("eraTitle"));
        eraStartDate.setText(getIntent().getStringExtra("eraStartDate"));
        eraEndDate.setText(getIntent().getStringExtra("eraEndDate"));
        eraText.setText(getIntent().getStringExtra("eraText"));
    }

    public void goBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void startNewAcivity(View view) {
        Intent intent = new Intent(this, DatePage.class);
        startActivity(intent);
    }
}