package com.example.nicolas.ejercicioextra.controller;

import com.example.nicolas.ejercicioextra.model.DAO.FilmsDao;
import com.example.nicolas.ejercicioextra.model.DAO.PeopleDao;
import com.example.nicolas.ejercicioextra.model.POJO.FilmsContainer;
import com.example.nicolas.ejercicioextra.model.POJO.People;
import com.example.nicolas.ejercicioextra.model.POJO.PeopleContainer;
import com.example.nicolas.ejercicioextra.util.ResultListener;

import java.util.List;

public class PeopleController {

    public void getPeople(final ResultListener <List<People>> listenerController) {
        PeopleDao peopleDao = new PeopleDao();
        peopleDao.getUnPeople(new ResultListener <PeopleContainer>() {
            @Override
            public void finish(PeopleContainer result) {
                listenerController.finish(result.getAllPeople());
            }
        });
    }

}
