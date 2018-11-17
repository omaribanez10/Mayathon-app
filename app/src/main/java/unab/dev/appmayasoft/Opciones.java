package unab.dev.appmayasoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opciones extends AppCompatActivity {

    Button crearSolicitud, verEstado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        crearSolicitud= findViewById(R.id.crearSolicitud);
        verEstado = findViewById(R.id.verEstado);


        crearSolicitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, Crear_Solicitud.class);
                startActivity(intent);
            }
        });

        verEstado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, recyclerSolicitudes.class);
                startActivity(intent);
            }
        });


    }
}
