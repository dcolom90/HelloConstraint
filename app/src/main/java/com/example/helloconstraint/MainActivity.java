package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int contador;
    Button boton1,boton2;
    TextView mostrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contador = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton1.setOnClickListener(view -> {
            Toast toast = Toast.makeText(this, String.valueOf(contador), Toast.LENGTH_SHORT);
            toast.show();
        });
        boton2.setOnClickListener(view -> {
            contador++;
            mostrador.setText(Integer.toString(contador));
        });
        mostrador = findViewById(R.id.textView);


    }

}