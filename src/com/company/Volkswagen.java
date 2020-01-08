package com.company;

public class Volkswagen extends Car {
    Volkswagen(CompType comp) {

        switch (comp) {
            case full:
                carComp = "full";
                break;
            case standard:
                carComp = "standard";;
                break;
        }
        carBrand = "Volkswagen";
    }
}
