package com.company.furnishings;
import com.company.decorator.FlowerBouquetDecorator;
import com.company.bouquets.FlowerBouquet;

public class Basket extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public Basket(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription(){
        return flowerBouquet.getDescription() + ", basket";
    }

    public double cost()
    {
        return 11;
    }
}
