package com.company;

public class SimpleCarFactory {
    public Car createCar(CarType type, CompType Comp) {
        Car car = null;

        switch (type) {
            case Nissan:
                car = new Nissan(Comp);
                break;
            case Volkswagen:
                car = new Volkswagen(Comp);
                break;
            case BMW:
                car = new BMW(Comp);
                break;
            case Toyota:
                car = new Toyota(Comp);
                break;
        }

        return car;

    }
}