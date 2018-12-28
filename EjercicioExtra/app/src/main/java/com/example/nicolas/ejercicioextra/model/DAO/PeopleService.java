package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PeopleService

{
    @GET("people/")
    public Call<PeopleContainer> getUnPeople(@Query("page") int page);
}
