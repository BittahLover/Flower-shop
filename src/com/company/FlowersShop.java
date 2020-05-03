package com.company;

import com.company.factory.FurnitureFactory;
import com.company.factory.FurnishingType;
import com.company.container.Container;
import com.company.factory.bouquet_factory.BouquetType;

import java.util.Scanner;

public class FlowersShop {

    public static void ShowMenuText(){
        System.out.println("1. Add Aster");
        System.out.println("2. Add Clove");
        System.out.println("3. Add Lily");
        System.out.println("4. Exit");
    }


    public static void main(String[] args) {

        Container container = new Container();

        exit:
        while (true) {

            ShowMenuText();

            Scanner in = new Scanner((System.in));

            int choiseOfCustomer = in.nextInt();


            switch (choiseOfCustomer) {

                case 1:
                    int tempChoiseOfCustomer;
                    System.out.println("Aster added 12$");

                    loop:
                    while (true) {
                        System.out.println("Would you like additional attributes?");
                        System.out.println("1. Add glitter");
                        System.out.println("2. Add paper wraper");
                        System.out.println("3. Add ribbon bow");
                        System.out.println("4. Add basket");
                        System.out.println("5. Add ropes");
                        System.out.println("6. Total sum of aster bouquet");

                        tempChoiseOfCustomer = in.nextInt();
                        switch(tempChoiseOfCustomer) {
                            case 1:

                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.ASTER, FurnishingType.GLITTER));
                                break;
                            case 2:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.ASTER, FurnishingType.PAPERWRAP));
                                break;
                            case 3:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.ASTER, FurnishingType.RIBBONBOW));
                                break;
                            case 4:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.ASTER, FurnishingType.BASKET));
                                break;
                            case 5:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.ASTER, FurnishingType.ROPES));
                                break;
                            case 6:
                                System.out.println("Total sum of aster bouquet and decoration: " + (container.getTotalSum() + 12) + " $");
                                break exit;
                            default:
                                System.out.println("Wrong input, try again");
                        }
                    }
                case 2:
                    int tempChoiseOfCustomer1;
                    System.out.println("Clover added 29$");

                    loop:
                    while (true) {
                        System.out.println("Would you like additional attributes?");
                        System.out.println("1. Add glitter");
                        System.out.println("2. Add paper wraper");
                        System.out.println("3. Add ribbon bow");
                        System.out.println("4. Add basket");
                        System.out.println("5. Add ropes");
                        System.out.println("6. Total sum of aster bouquet");

                        tempChoiseOfCustomer1 = in.nextInt();
                        switch(tempChoiseOfCustomer1) {
                            case 1:

                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.CLOVER, FurnishingType.GLITTER));
                                break;
                            case 2:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.CLOVER, FurnishingType.PAPERWRAP));
                                break;
                            case 3:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.CLOVER, FurnishingType.RIBBONBOW));
                                break;
                            case 4:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.CLOVER, FurnishingType.BASKET));
                                break;
                            case 5:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.CLOVER, FurnishingType.ROPES));
                                break;
                            case 6:
                                System.out.println("Total sum of clove bouquets and decoration: " + (container.getTotalSum() + 29) + " $");
                                break exit;
                            default:
                                System.out.println("Wrong input, try again");
                        }
                    }
                case 3:
                    int tempChoiseOfCustomer2;
                    System.out.println("Lily added 55$");

                    loop:
                    while (true) {
                        System.out.println("Would you like additional attributes?");
                        System.out.println("1. Add glitter");
                        System.out.println("2. Add paper wraper");
                        System.out.println("3. Add ribbon bow");
                        System.out.println("4. Add basket");
                        System.out.println("5. Add ropes");
                        System.out.println("6. Total sum of aster bouquet");

                        tempChoiseOfCustomer2 = in.nextInt();
                        switch(tempChoiseOfCustomer2) {
                            case 1:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.LILY, FurnishingType.GLITTER));
                                break;
                            case 2:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.LILY, FurnishingType.PAPERWRAP));
                                break;
                            case 3:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.LILY, FurnishingType.RIBBONBOW));
                                break;
                            case 4:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.LILY, FurnishingType.BASKET));
                                break;
                            case 5:
                                container.addBouquet(FurnitureFactory.addFurniture(BouquetType.LILY, FurnishingType.ROPES));
                                break;
                            case 6:
                                System.out.println("Total sum of lily bouquets and decoration: " + (container.getTotalSum() + 55) + " $");
                                break exit;
                            default:
                                System.out.println("Wrong input, try again");
                        }
                    }
                case 4:
                    break exit;
                default:
                    System.out.println("Wrong input, try again :)");
            }
        }
    }
}