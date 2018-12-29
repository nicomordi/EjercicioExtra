package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Planet implements Serializable {

    private String name;
    private String diameter;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String created;
    private String edited;
    private String url;

    @SerializedName("rotation_period")
    private String rotationPeriod;

    @SerializedName("orbital_period")
    private String orbitalPeriod;

    @SerializedName("surface_water")
    private String surfaceWater;

    @SerializedName("residents")
    private List<String> residentsUrls;

    @SerializedName("films")
    private List<String> filmsUrls;

    public String getName() {
        return name;
    }
}
