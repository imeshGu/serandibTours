package com.example.serandibtours;

import java.util.ArrayList;

public class TourPlan {
    private String destination;
    private String accommodation;
    private String date ;
    private ArrayList<String> otherPlaces;
    private String noOfDays;


    public TourPlan(String destination, String accommodation, String date,String noOfDays) {
        this.destination = destination;
        this.accommodation = accommodation;
        this.date = date;

        this.noOfDays = noOfDays;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOtherPlaces(ArrayList otherPlaces) {
        this.otherPlaces = otherPlaces;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getDestination() {
        return destination;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public String getDate() {
        return date;
    }

    public ArrayList getOtherPlaces() {
        return otherPlaces;
    }

    public String getNoOfDays() {
        return noOfDays;
    }
}
