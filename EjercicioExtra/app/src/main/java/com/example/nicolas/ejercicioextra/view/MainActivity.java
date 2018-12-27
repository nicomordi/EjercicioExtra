package com.example.nicolas.ejercicioextra.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nicolas.ejercicioextra.R;
import com.example.nicolas.ejercicioextra.model.POJO.People;

public class MainActivity extends AppCompatActivity implements FragmentPeople.ListenerPeople {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPeople fragmentPeople = new FragmentPeople();
        cambiarFragment(fragmentPeople);
    }


    public void cambiarFragment (Fragment unFragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.contenedor_fragment, unFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void peopleSeleccionado(People people) {



    }
}
