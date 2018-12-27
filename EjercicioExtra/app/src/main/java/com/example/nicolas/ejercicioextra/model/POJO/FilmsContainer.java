package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilmsContainer {


    private List<Films> films;

    public FilmsContainer(List<Films>films){this.films=films;}

    public List<Films> getFilms() {return films;}
}
