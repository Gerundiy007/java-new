package org.example.lesson2.homework2;

public class House {

        String address;
        int flat;
        public boolean forTheMajors;
        protected double yearOfConstruction;


        public House() {}
    
        public House(String address, int flat, boolean forTheMajors, double yearOfConstruction) {
            this.address = address;
            this.flat = flat;
            this.forTheMajors = forTheMajors;
            this.yearOfConstruction = yearOfConstruction;
        }
        
        public House(int flat) {
            this.flat = flat;
        }
    }

