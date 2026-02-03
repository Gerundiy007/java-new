package org.example.lesson2.homework2;

public class MainHouse {
    public static void main(String[] args) {
        House house = new House();
        house.forTheMajors = true;
        house.flat = 147;
        house.yearOfConstruction = 2015;
        house.address = "д. Пушкина,у. Колотушкино 11";

        House house2 = new House();
        house2.forTheMajors = false;
        house2.flat = 14;
        house2.yearOfConstruction = 2000;
        house2.address = "д. Есенина ,у. Плесенина 12";

        House house3 = new House(145);
        House house4 = new House("д. Пушкина,у. Колотушкино 11",18,true,2000);
        //213

    }
}
