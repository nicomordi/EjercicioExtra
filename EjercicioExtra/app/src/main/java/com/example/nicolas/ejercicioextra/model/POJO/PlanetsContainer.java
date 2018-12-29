package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlanetsContainer {

    @SerializedName("results")

    private List<Planet> planets;
    private PeoplePaging planetPaging;

    public PlanetsContainer(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Planet> getAllPlanets() {
        return planets;
    }

    public PeoplePaging getPlanetPaging() {
        return planetPaging;
    }

    public class PeoplePaging {

        private Integer offset;

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }
    }
}
