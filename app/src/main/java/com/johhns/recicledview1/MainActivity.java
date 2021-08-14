package com.johhns.recicledview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contactos> alsContactos ;
    RecyclerView         rvwContactos ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alsContactos = new ArrayList<>();
        rvwContactos = (RecyclerView) findViewById(R.id.rcView1) ;
        rvwContactos.setLayoutManager( new LinearLayoutManager(this));

        llenar_lista();

        Adaptador adapter = new Adaptador(alsContactos);
        rvwContactos.setAdapter(adapter);

    }


    private void llenar_lista(){
        alsContactos.add( new Contactos( R.drawable.imagen1 ,"Foto 1", "1111-1111" ) );
        alsContactos.add( new Contactos( R.drawable.imagen2 ,"Foto 2", "2222-2222" ) );
        alsContactos.add( new Contactos( R.drawable.imagen3 ,"Foto 3", "3333-3333" ) );
        alsContactos.add( new Contactos( R.drawable.imagen4 ,"Foto 4", "4444-4444" ) );
        alsContactos.add( new Contactos( R.drawable.imagen5 ,"Foto 5", "5555-5555" ) );
    }

}