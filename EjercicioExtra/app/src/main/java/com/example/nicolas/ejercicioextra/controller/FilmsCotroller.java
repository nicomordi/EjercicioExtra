package com.example.nicolas.ejercicioextra.controller;

import com.example.nicolas.ejercicioextra.model.DAO.FilmsDao;
import com.example.nicolas.ejercicioextra.model.POJO.Films;
import com.example.nicolas.ejercicioextra.model.POJO.FilmsContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;

public class FilmsCotroller {

    public void getFilm(final ResultListener<FilmsContainer> listenerController) {
        FilmsDao filmsDao = new FilmsDao();
        filmsDao.getOneFilm(new ResultListener<FilmsContainer>() {
            @Override
            public void finish(FilmsContainer result) {
                listenerController.finish(result);
            }
        });
    }


}
