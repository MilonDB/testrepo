package com.company;

public class Persoon {

    private String naam;
    private String woonplaats;

    public Persoon(String naam, String woonplaats) {
        this.naam = naam;
        this.woonplaats = woonplaats;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}
