package com.company.furnishings;
import com.company.decorator.FlowerBouquetDecorator;
import com.company.bouquets.FlowerBouquet;

public class Glitter extends FlowerBouquetDecorator {
    
    FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription(){
        return flowerBouquet.getDescription() + ", glitter";
    }

    public double cost()
    {
        return 4;
    }
}
