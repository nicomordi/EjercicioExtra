package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeopleContainer {

    @SerializedName("results")

    private List<People> people;

    public PeopleContainer(List<People>people){this.people=people;}

    public List<People> getAllPeople() {return people;}

}
