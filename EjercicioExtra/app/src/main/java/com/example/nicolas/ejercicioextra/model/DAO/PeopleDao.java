package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.controller.PeopleController;
import com.example.nicolas.ejercicioextra.model.POJO.People;
import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeopleDao extends PeopleRetrofit {

    private static final String BASE_URL = "https://swapi.co/api/";
    private PeopleService peopleService;

    public PeopleDao() {
        super(BASE_URL);
        peopleService= retrofit.create(PeopleService.class);
    }

    public void getUnPeople(final ResultListener<PeopleContainer> listenerController) {

        Call<PeopleContainer> call = peopleService.getUnPeople(1); //request para un articulo

        call.enqueue(new Callback<PeopleContainer>() { //se pone en lista la request.
            @Override
            public void onResponse(Call<PeopleContainer> call, Response<PeopleContainer> response) {
                PeopleContainer peopleContainer = response.body();
                listenerController.finish(peopleContainer); //le avisa al controller de la llegada del articulo con el metodo finish
            }

            @Override
            public void onFailure(Call<PeopleContainer> call, Throwable t) {
                //nada
            }
        });
    }
}
