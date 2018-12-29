package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.PlanetsContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;
import com.example.nicolas.ejercicioextra.util.ResultPlanetListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlanetsDao extends PlanetsRetrofit{

    private static final String BASE_URL = "https://swapi.co/api/";
    private PlanetsService planetsService;


    public PlanetsDao() {
        super(BASE_URL);
        planetsService= retrofit.create(PlanetsService.class);
    }

    public void getUnPlanet(final ResultPlanetListener<PlanetsContainer> listenerController) {


        Call<PlanetsContainer> call = planetsService.getUnPlanet(1); //request para un articulo

        call.enqueue(new Callback<PlanetsContainer>() { //se pone en lista la request.
            @Override
            public void onResponse(Call<PlanetsContainer> call, Response<PlanetsContainer> response) {
                PlanetsContainer planetsContainer = response.body();
                listenerController.finish(planetsContainer); //le avisa al controller de la llegada del articulo con el metodo finish
            }

            @Override
            public void onFailure(Call<PlanetsContainer> call, Throwable t) {
                //nada
            }
        });
    }
}
