package com.example.sixthguidedactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox one, two, three, four;
    TextView result;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        one = findViewById(R.id.chkOne);
        two = findViewById(R.id.chkTwo);
        three = findViewById(R.id.chkThree);
        four = findViewById(R.id.chkFour);

        result = findViewById(R.id.resultText);
        click = findViewById(R.id.btnClick);

        click.setOnClickListener(view -> showResult());
    }

    public void showResult() {
        if (one.isChecked() && two.isChecked() && three.isChecked() && four.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.GREEN);
            result.setText("Number Combination Color is GREEN");
        } else if (two.isChecked() && four.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.RED);
            result.setText("Number Combination Color is RED");
        } else if (one.isChecked() && three.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.BLUE);
            result.setText("Number Combination Color is BLUE");
        } else if (one.isChecked() && two.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.YELLOW);
            result.setText("Number Combination Color is YELLOW");
        } else if (two.isChecked() && three.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.MAGENTA);
            result.setText("Number Combination Color is MAGENTA");
        } else if (three.isChecked() && four.isChecked()) {
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.BLACK);
            result.setText("Number Combination Color is BLACK");
        } else {
            result.setVisibility(View.INVISIBLE);
        }
    }
}
