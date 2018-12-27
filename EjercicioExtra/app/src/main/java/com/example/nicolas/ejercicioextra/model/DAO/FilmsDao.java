package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.FilmsContainer;
import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FilmsDao extends FilmsRetrofit {

    private FilmsService filmsService;
    private static final String BASE_URL = "https://swapi.co/api/";

    public FilmsDao() {
        super(BASE_URL);
        filmsService = retrofit.create(FilmsService.class);
    }

    public void getOneFilm(final ResultListener<FilmsContainer> listenerController) {

        Call<FilmsContainer> call = filmsService.getUnFilm(); //request para un articulo

        call.enqueue(new Callback<FilmsContainer>() { //se pone en lista la request.
            @Override
            public void onResponse(Call<FilmsContainer> call, Response<FilmsContainer> response) {
                FilmsContainer filmsContainer = response.body();
                listenerController.finish(filmsContainer); //le avisa al controller de la llegada del articulo con el metodo finish
            }

            @Override
            public void onFailure(Call<FilmsContainer> call, Throwable t) {
                //nada
            }
        });
    }

}
