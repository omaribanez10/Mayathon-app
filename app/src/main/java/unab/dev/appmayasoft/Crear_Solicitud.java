package unab.dev.appmayasoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Crear_Solicitud extends AppCompatActivity {
   EditText titulo,descripcion,monto,categoria,tiempodesembolso,porcentajeRentabilidad;
   Button crear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear__solicitud);
        titulo = findViewById(R.id.titulo);
        descripcion = findViewById(R.id.descripcion);
        monto = findViewById(R.id.monto);
        categoria = findViewById(R.id.categoria);
        tiempodesembolso = findViewById(R.id.tiempodesembolso);
        porcentajeRentabilidad = findViewById(R.id.porcentajeRentabilidad);
        crear = findViewById(R.id.crearSoli);


        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!titulo.getText().toString().trim().equalsIgnoreCase("") ||
                        !descripcion.getText().toString().trim().equalsIgnoreCase("") ||
                        !monto.getText().toString().trim().equalsIgnoreCase("") ||
                        !categoria.getText().toString().trim().equalsIgnoreCase("") ||
                        !tiempodesembolso.getText().toString().trim().equalsIgnoreCase("") ||
                        !porcentajeRentabilidad.getText().toString().trim().equalsIgnoreCase("") )


                {
                    Intent intent = new Intent(Crear_Solicitud.this, Opciones.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(Crear_Solicitud.this, "Hay campos de texto vacíos", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}
