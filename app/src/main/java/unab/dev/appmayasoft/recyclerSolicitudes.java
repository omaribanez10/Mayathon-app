package unab.dev.appmayasoft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

public class recyclerSolicitudes extends AppCompatActivity {

    RecyclerView recyclerviewSolicitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_solicitudes);

        recyclerviewSolicitud = findViewById(R.id.recyclerviewSolicitud);


    }
}
