package unab.dev.appmayasoft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class recyclerSolicitudes extends AppCompatActivity {

    RecyclerView recyclerviewServicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_solicitudes);

        recyclerviewServicio = findViewById(R.id.recyclerviewServicio);
    }
}
