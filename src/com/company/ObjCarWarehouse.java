package com.company;

public class ObjCarWarehouse {

    private final SimpleCarFactory CarFactory;

    public ObjCarWarehouse(SimpleCarFactory CarFactory) {
        this.CarFactory = CarFactory;
    }

    public Car ObjCar(CarType type, CompType Comp) {
        Car car = CarFactory.createCar(type, Comp);
        return car;
    }
}