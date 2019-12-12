
package com.example.road;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private Button btnLocalizar;
    //private MapView mapInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnLocalizar = (Button) findViewById(R.id.btnLocalizar);
        //this.mapInicio = (MapView) findViewById(R.id.mapInicio);
        //Botón para localizar al sujeto
        this.btnLocalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMapa();
            }
        });
    }

    public void abrirMapa(){
        Intent intento = new Intent(MainActivity.this, MapsActivity.class);
        intento.putExtra("pulsa",true);
        startActivity(intento);
    }
}
