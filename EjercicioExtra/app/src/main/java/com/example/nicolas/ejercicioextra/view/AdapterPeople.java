package com.example.nicolas.ejercicioextra.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nicolas.ejercicioextra.R;
import com.example.nicolas.ejercicioextra.model.POJO.People;

import java.util.ArrayList;
import java.util.List;

public class AdapterPeople  extends RecyclerView.Adapter<AdapterPeople.PeopleViewHolder> {

    private List<People> peopleList;
    private ListenerAdapterPeople listener;

    public AdapterPeople(ListenerAdapterPeople listener) {
        this.peopleList = new ArrayList<>();
        this.listener = listener;
    }

    public interface ListenerAdapterPeople {
        public void peopleSeleccionado(People people);

    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View viewDeLaCelda =  inflador.inflate(R.layout.celda_recycler_people, parent, false);
        PeopleViewHolder peopleViewHolder = new PeopleViewHolder(viewDeLaCelda);
        return peopleViewHolder;
    }

    public void agregarPeople(People people)
    {
        peopleList.add(0,people);
        notifyDataSetChanged();
    }

    //Pone los datos con la imagen
    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
       holder.bindPeople(peopleList.get(position));
    }

    @Override
    public int getItemCount() {
        if(peopleList != null) {
            return peopleList.size();
        } else {
            return 0;
        }
    }


    public class PeopleViewHolder extends RecyclerView.ViewHolder {

        private TextView nombrePeople;
        private TextView homeworldPeople;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);

            nombrePeople = itemView.findViewById(R.id.cell_nombre_people);
            homeworldPeople = itemView.findViewById(R.id.cell_homeworld_people);

            nombrePeople.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer posicionAdapter = getAdapterPosition();
                    People people = peopleList.get(posicionAdapter);
                    listener.peopleSeleccionado(people);
                }
            });
            homeworldPeople.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer posicionAdapter = getAdapterPosition();
                    People people = peopleList.get(posicionAdapter);
                    listener.peopleSeleccionado(people);
                }
            });
        }


        public void bindPeople(People people) {
//
            nombrePeople.setText(people.getName());
            homeworldPeople.setText(people.getHomeworld());

        }


    }



}


