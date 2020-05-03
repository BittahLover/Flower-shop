package com.company.bouquets;

public abstract class FlowerBouquet {

    String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
