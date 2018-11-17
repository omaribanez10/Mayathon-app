package unab.dev.appmayasoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

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
                if (!titulo.getText().toString().trim().equalsIgnoreCase("") &&
                        !descripcion.getText().toString().trim().equalsIgnoreCase("") &&
                        !monto.getText().toString().trim().equalsIgnoreCase("") &&
                        !categoria.getText().toString().trim().equalsIgnoreCase("") &&
                        !tiempodesembolso.getText().toString().trim().equalsIgnoreCase("") &&
                        !porcentajeRentabilidad.getText().toString().trim().equalsIgnoreCase("") )


                {
                    Intent intent = new Intent(Crear_Solicitud.this, Opciones.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(Crear_Solicitud.this, "Hay campos de texto vacíos", Toast.LENGTH_SHORT).show();

                }
            }
        });


        OkHttpClient objeto = new OkHttpClient();
        RequestBody formBody = new FormEncodingBuilder()
                .add("id", "1")
                .add("titulo", titulo.getText().toString())
                .add("descripcion", descripcion.getText().toString())
                .add("montoSolicitud", monto.getText().toString())
                .add("categoriadeInversion",  categoria.getText().toString())
                .add("valorInvertido",  "1000")
                .add("porcentajeRentabilidad",  porcentajeRentabilidad.getText().toString())
                .add("tiempodesembolso",  tiempodesembolso.getText().toString())
                .build();


        String ip = getString(R.string.ip);
        Request request = new Request.Builder().url(ip +"").post(formBody).build();
        Call call = objeto.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.i("error", "error en " + e);
            }

            @Override
            public void onResponse(Response response) throws IOException {

                Toast.makeText(Crear_Solicitud.this, "Su solicitud ha sido publicada", Toast.LENGTH_SHORT).show();



                Intent llevar = new Intent(Crear_Solicitud.this, Opciones.class);
                startActivity(llevar);


            }
        });
    }
    }


