package com.example.corpsarens2.proyecto3;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.KeyStore;

public class Proyecto3 extends AppCompatActivity {

    Button Entrar;
    EditText  Usuario;
    EditText Contraseña;
    TextView Texto1;
    TextView Texto2;
    TextView Texto3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto3);
     Entrar= (Button) findViewById(R.id.Login_Usuario);
        Usuario= (EditText) findViewById(R.id.Nombre_Usuario);
        Contraseña= (EditText) findViewById(R.id.Contraseña_Usuario);
        Texto1=(TextView) findViewById(R.id.Texto_1);
        Texto2=(TextView) findViewById(R.id.Texto_2);
        Texto3=(TextView) findViewById(R.id.Texto_3);

    }
}
