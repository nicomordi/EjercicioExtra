package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.PlanetsContainer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlanetsService {

    @GET("planets/")
    public Call<PlanetsContainer> getUnPlanet(@Query("page") int page);
}
