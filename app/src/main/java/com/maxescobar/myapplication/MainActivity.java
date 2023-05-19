package com.maxescobar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu(Menu menu) {
        //Con esto comuncamos el activity del menu con sus botones
        //con R.menu.menuacciones le damos la ubicacion del menu y lo referenciamos con la el argumento de la funcion
        getMenuInflater().inflate(R.menu.menuacciones, menu);

        return true;
    }

    //Metodo para agregar las acciones de los botones
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        //Logica sencilla para controlar los botones
        if (id == R.id.compartir){
            Toast.makeText(this,"Compartir",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.buscar){
            Toast.makeText(this,"Buscar",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.opcion1){
            Toast.makeText(this,"Opcion 1",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.opcion2){
            Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}