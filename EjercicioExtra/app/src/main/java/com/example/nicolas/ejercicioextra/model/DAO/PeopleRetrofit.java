package com.example.nicolas.ejercicioextra.model.DAO;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeopleRetrofit {

    protected Retrofit retrofit;

    public PeopleRetrofit(String baseUrl)
    {

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder(); //maneja conexiones a internet.
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
        retrofit = builder.client(okHttpClient.build()).build();
    }
    }
