package com.ejercicio.alexandra.practica_calificado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {



    @Bind(R.id.cuenta)
    EditText correo;

    @Bind(R.id.contraseña)
    EditText contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void register(View view) {
        String getcuenta = correo.getText().toString();
        String getcontraseña = contraseña.getText().toString();

        if(getcuenta.length() == 0 || getcontraseña.length() == 0)
            Toast.makeText(this,"Completar los campos requeridos", Toast.LENGTH_SHORT).show();
        else if (getcuenta == "yanelaalexandra" || getcontraseña == "pachacama123"){

            Toast.makeText(this,"Bienvenida "+ getcuenta, Toast.LENGTH_SHORT).show();


        }
    }
                }





