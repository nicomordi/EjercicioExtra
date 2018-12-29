package com.example.nicolas.ejercicioextra.model.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeopleContainer {

    @SerializedName("results")

    private List<People> people;
    private PeoplePaging peoplePaging;

    public PeopleContainer(List<People>people){this.people=people;}

    public List<People> getAllPeople() {return people;}

    public PeoplePaging getPeoplePaging(){return peoplePaging;}

    public class PeoplePaging{

        private Integer offset;

        public Integer getOffset() {
            return offset;
        }
        public void setOffset(Integer offset) {
            this.offset = offset;
        }
    }


}
