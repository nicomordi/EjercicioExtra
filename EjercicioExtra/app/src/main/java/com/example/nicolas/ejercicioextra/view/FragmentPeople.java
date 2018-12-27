package com.example.nicolas.ejercicioextra.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nicolas.ejercicioextra.R;
import com.example.nicolas.ejercicioextra.controller.PeopleController;
import com.example.nicolas.ejercicioextra.model.POJO.People;
import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPeople extends Fragment implements AdapterPeople.ListenerAdapterPeople{


    private AdapterPeople adapterPeople;
    private ListenerPeople listenerPeople;


    public FragmentPeople() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


      listenerPeople = (ListenerPeople) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_people, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_people);
        adapterPeople = new AdapterPeople( this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapterPeople);

        getUnPeople();
        return view;

    }

    @Override
    public void peopleSeleccionado(People people) {

        listenerPeople.peopleSeleccionado(people);


    }

    public interface ListenerPeople{
        public void peopleSeleccionado (People people);

    }

    public void getUnPeople(){
        PeopleController peopleController = new PeopleController();
        peopleController.getPeople(new ResultListener <PeopleContainer>() {


            @Override
            public void finish(PeopleContainer result) {

                for(People people: result.getAllPeople())

                adapterPeople.agregarPeople(people);
            }
        });
    }
}
