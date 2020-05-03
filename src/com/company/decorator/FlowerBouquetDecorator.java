package com.company.decorator;
import com.company.bouquets.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
