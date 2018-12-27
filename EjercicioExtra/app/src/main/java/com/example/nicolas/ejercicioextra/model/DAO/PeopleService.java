package com.example.nicolas.ejercicioextra.model.DAO;

import com.example.nicolas.ejercicioextra.model.POJO.People;
import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PeopleService

{
    @GET("results")
    Call <PeopleContainer> getUnPeople();
}
