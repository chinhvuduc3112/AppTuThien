package com.example.vuduc.model;

/**
 * Created by VuDuc on 1/12/2017.
 */

public class Location {
    private String city;
    private String district;
    private String ward;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public Location(String city, String district, String ward) {
        this.city = city;
        this.district = district;
        this.ward = ward;
    }

    public Location() {
    }
}
