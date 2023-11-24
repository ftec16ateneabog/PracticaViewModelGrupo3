package com.atenea.practicaviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.atenea.practicaviewmodel.Models.Usuario;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyViewModel myViewModel;
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        EditText NombreTextView = findViewById(R.id.NombreTextView);
        EditText EdadTextView = findViewById(R.id.EdadTextView);
        EditText contrasenaTextView = findViewById(R.id.ContrasenaTextView);
        Button RegistrarButton = findViewById(R.id.RegistrarButton);

        RegistrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario(NombreTextView.getText().toString(),Integer.parseInt(EdadTextView.getText().toString()),contrasenaTextView.getText().toString());
                myViewModel.registrarV(usuario);
            }
        });

        Observer<Usuario> observer = new Observer<Usuario>() {
            @Override
            public void onChanged(Usuario usuarioObs) {
                NombreTextView.setText(usuarioObs.getNombre().toString());
                EdadTextView.setText(String.valueOf(usuarioObs.getEdad()));
                contrasenaTextView.setText(usuarioObs.getContrasena().toString());
            }
        };

        myViewModel.getResult().observe(this,observer);

    }
}