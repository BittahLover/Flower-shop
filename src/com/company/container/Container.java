package com.company.container;
import java.util.ArrayList;
import java.util.List;
import com.company.bouquets.*;

public class Container {


    List<FlowerBouquet> bouquets = new ArrayList<FlowerBouquet>();
    int totalSum = 0;
    public void addBouquet(FlowerBouquet bouquet)
    {
        bouquets.add(bouquet);
    }

    public int getTotalSum(){
        totalSum = 0;
        for(int i = 0; i < bouquets.size(); i++){
            totalSum += bouquets.get(i).cost();
        }
        return totalSum;
    }



}


