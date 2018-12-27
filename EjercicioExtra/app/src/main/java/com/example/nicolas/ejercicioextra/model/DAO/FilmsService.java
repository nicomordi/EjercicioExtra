package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.FilmsContainer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FilmsService {


    @GET("films")
    Call<FilmsContainer> getUnFilm();


}
