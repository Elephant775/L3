package com.company;

public class Nissan extends Car {
    Nissan(CompType comp) {

        switch (comp) {
            case full:
                carComp = "full";
                break;
            case standard:
                carComp = "standard";
                break;
        }
        carBrand = "Nissan";
    }
}
