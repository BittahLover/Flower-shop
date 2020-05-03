package com.company.furnishings;

import com.company.decorator.FlowerBouquetDecorator;
import com.company.bouquets.FlowerBouquet;

public class RibbonBow extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;
    public RibbonBow(FlowerBouquet flowerBouquet)
    {
        this.flowerBouquet = flowerBouquet;
    }
    public String getDescription(){
        return flowerBouquet.getDescription() + ", ribbon bow";
    }
    public double cost(){
        return 6;
    }
}
