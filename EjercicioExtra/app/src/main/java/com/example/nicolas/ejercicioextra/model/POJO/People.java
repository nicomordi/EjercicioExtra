package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;



public class People implements Serializable {

    private String name;

    @SerializedName("birth_year")
    private String birthYear;

    @SerializedName("films")
    private List<String> filmsUrls;

    private String gender;

    @SerializedName("hair_color")
    private String hairColor;

    private String height;

    @SerializedName("homeworld")
    private String homeWorldUrl;

    private String mass;

    @SerializedName("skin_color")
    private String skinColor;

    private String created;
    private String edited;
    private String url;
    @SerializedName("species")
    private List<String> speciesUrls;

    @SerializedName("starships")
    private List<String> starshipsUrls;

    @SerializedName("vehicles")
    private List<String> vehiclesUrls;

    public String getHomeWorldUrl() {
        return Planet.class.getName();
    }

    public String getName() {
        return name;
    }


}
