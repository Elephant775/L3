package com.company;

public class Toyota extends Car {

    Toyota(CompType comp) {

    switch (comp) {
        case full:
            carComp = "full";
            break;
        case standard:
            carComp = "standard";;
            break;
    }
    carBrand = "Toyota";
}
}
