package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private boolean isClicked = false;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        display();
        btn.setBackgroundResource(R.drawable.btnstyle);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display();
            }
        });
    }

    private void display() {
        fragmentTransaction = fragmentManager.beginTransaction();
        if(!isClicked) {fragmentTransaction.replace(R.id.Informasi, new ProductInfo());
            isClicked = true;
            btn.setText(R.string.btnKelebihan);
        }
        else {fragmentTransaction.replace(R.id.Informasi, new Kelebihan());
            isClicked = false;
            btn.setText(R.string.btnBack);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}