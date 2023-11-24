package com.atenea.practicaviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyViewModel myViewModel;
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        TextView ContadortextView = findViewById(R.id.ContadorTextView);
        Button AgregarButton = findViewById(R.id.AgregarButton);

        AgregarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myViewModel.agregar(Integer.parseInt(ContadortextView.getText().toString()));
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                ContadortextView.setText(String.valueOf(integer));
            }
        };

        myViewModel.getResult().observe(this,observer);

    }
}