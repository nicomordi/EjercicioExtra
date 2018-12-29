package com.example.nicolas.ejercicioextra.controller;

import com.example.nicolas.ejercicioextra.model.DAO.PlanetsDao;
import com.example.nicolas.ejercicioextra.model.POJO.Planet;
import com.example.nicolas.ejercicioextra.model.POJO.PlanetsContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;
import com.example.nicolas.ejercicioextra.util.ResultPlanetListener;

import java.util.List;

public class PlanetsController {

    public void getPlanet(final ResultPlanetListener<List<Planet>> listenerController) {
        PlanetsDao planetsDao = new PlanetsDao();
        planetsDao.getUnPlanet(new ResultPlanetListener<PlanetsContainer> () {
            @Override
            public void finish(PlanetsContainer result) {
                listenerController.finish(result.getAllPlanets());
            }
        });
    }
}
