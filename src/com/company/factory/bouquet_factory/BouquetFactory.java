package com.company.factory.bouquet_factory;

import com.company.bouquets.AsterBouquet;
import com.company.bouquets.CloveBouquet;
import com.company.bouquets.FlowerBouquet;
import com.company.bouquets.LilyBouquet;

public class BouquetFactory
{
    public static void ShowAster(FlowerBouquet asterBouquet)
    {
        System.out.println(asterBouquet.getDescription()
                + " $ " + asterBouquet.cost());

    }

    public static void ShowClove(FlowerBouquet cloveBouquet)
    {
        System.out.println(cloveBouquet.getDescription()
                + " $ " + cloveBouquet.cost());

    }

    public static void showLily(FlowerBouquet lilyBouquet)
    {
        System.out.println(lilyBouquet.getDescription()
                + " $ " + lilyBouquet.cost());

    }

    public static FlowerBouquet add(BouquetType bouquet)
    {
        switch(bouquet)
        {
            case ASTER:
                return new AsterBouquet();
            case CLOVER:
                return new CloveBouquet();
            case LILY:
                return new LilyBouquet();
        }

        return null;
    }
}