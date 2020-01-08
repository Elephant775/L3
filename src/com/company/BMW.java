package com.company;

public class BMW extends Car {

    BMW(CompType comp) {

        switch (comp) {
            case full:
                carComp = "full";
                break;
            case standard:
                carComp = "standard";;
                break;
        }
        carBrand = "BMW";
    }
}
