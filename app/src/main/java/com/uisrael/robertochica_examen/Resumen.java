package com.uisrael.robertochica_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    TextView recibo;

    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        recibo=findViewById(R.id.tvUsuario);

        datos=getIntent().getExtras();
        String datosObtenidos=datos.getString("datoEnviado3");
        recibo.setText("usuario: "+datosObtenidos);
    }
}
