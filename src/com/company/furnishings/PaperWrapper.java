package com.company.furnishings;

import com.company.decorator.FlowerBouquetDecorator;
import com.company.bouquets.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;
    public PaperWrapper(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }
    public String getDescription(){
        return flowerBouquet.getDescription() + ", paper wrap";
    }
    public double cost(){
        return 3;
    }
}
