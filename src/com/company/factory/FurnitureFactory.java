package com.company.factory;

import com.company.bouquets.*;
import com.company.factory.bouquet_factory.BouquetType;
import com.company.factory.bouquet_factory.BouquetFactory;
import com.company.furnishings.*;

public class FurnitureFactory
{
    public static void Show(FlowerBouquet bouquet){
        System.out.println(bouquet.getDescription()
        +  " " + bouquet.cost() + "$");
    }

    public static FlowerBouquet addFurniture(BouquetType bouquet, FurnishingType items)
    {
        FlowerBouquet decoratedBouquet = BouquetFactory.add(bouquet);

        switch (items)
        {
            case GLITTER:
                decoratedBouquet = new Glitter(decoratedBouquet);
                Show(decoratedBouquet);
                return  decoratedBouquet;

            case PAPERWRAP:

                decoratedBouquet = new PaperWrapper(decoratedBouquet);
                Show(decoratedBouquet);
                return decoratedBouquet;

            case RIBBONBOW:
                decoratedBouquet = new RibbonBow(decoratedBouquet);
                Show(decoratedBouquet);
                return decoratedBouquet;

            case BASKET:
                decoratedBouquet = new Basket(decoratedBouquet);
                Show(decoratedBouquet);
                return decoratedBouquet;

            case ROPES:
                decoratedBouquet = new Ropes(decoratedBouquet);
                Show(decoratedBouquet);
                return decoratedBouquet;
        }

        return null;
    }
}

