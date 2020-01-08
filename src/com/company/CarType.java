package com.company;

import java.util.Random;

public enum CarType {
    BMW,
    Toyota,
    Nissan,
    Volkswagen;

    public static CarType getRandomCarType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}