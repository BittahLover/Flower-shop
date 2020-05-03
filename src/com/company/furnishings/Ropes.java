package com.company.furnishings;
import com.company.decorator.FlowerBouquetDecorator;
import com.company.bouquets.FlowerBouquet;

public class Ropes extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public Ropes(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription(){
        return flowerBouquet.getDescription() + ", ropes";
    }

    public double cost()
    {
        return 7;
    }
}
