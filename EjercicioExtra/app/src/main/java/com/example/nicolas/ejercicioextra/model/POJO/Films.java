package com.example.nicolas.ejercicioextra.model.POJO;

import java.lang.reflect.Array;
import java.util.Date;

public class Films {

    String title;
    Integer episode_id;
    String opening_crawl;
    String director;
    String producer;
    Date release_date;
    Array species;
    Array starships;
    Array vehicles;
    Array characters;
    Array planets;
    String url;
    String created;
    String edited;

    public Films(String title, Integer episode_id, String opening_crawl, String director, String producer, Date release_date, Array species, Array starships, Array vehicles, Array characters, Array planets, String url, String created, String edited) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.species = species;
        this.starships = starships;
        this.vehicles = vehicles;
        this.characters = characters;
        this.planets = planets;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public Array getSpecies() {
        return species;
    }

    public Array getStarships() {
        return starships;
    }

    public Array getVehicles() {
        return vehicles;
    }

    public Array getCharacters() {
        return characters;
    }

    public Array getPlanets() {
        return planets;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }
}
