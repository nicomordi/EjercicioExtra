package com.example.nicolas.ejercicioextra.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nicolas.ejercicioextra.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFilms extends Fragment{


    public FragmentFilms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_films, container, false);
    }

}
