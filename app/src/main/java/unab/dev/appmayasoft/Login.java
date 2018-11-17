package unab.dev.appmayasoft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText correo, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.enviarTest);
        correo = findViewById(R.id.observaciones);
        password = findViewById(R.id.contraseña);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!correo.getText().toString().trim().equalsIgnoreCase("") &&
                        !password.getText().toString().trim().equalsIgnoreCase("")) {

                   verificarLogin();


                } else {
                    Toast.makeText(Login.this, "Hay campos de texto vacíos", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
    public void verificarLogin(){
       String pass = "r";
       String mail = "r";

       if (pass.equalsIgnoreCase(password.getText().toString()) && mail.equalsIgnoreCase(correo.getText().toString())){
           Intent intent = new Intent(Login.this, Opciones.class);
           startActivity(intent);
        } else{
           Toast.makeText(getApplicationContext(),"Datos incorrectos, intententelo nuevamente",Toast.LENGTH_SHORT).show();
       }

    }
}
