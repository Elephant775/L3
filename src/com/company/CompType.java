package com.company;
import java.util.Random;
public enum CompType {
    standard,
    full;

    public static CompType getRandomCompType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
