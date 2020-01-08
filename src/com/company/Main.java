package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SimpleCarFactory CarFactory = new SimpleCarFactory();
        ObjCarWarehouse objCarWarehouse = new ObjCarWarehouse(CarFactory);
        Warehouse.getWarehouseInstance().getWarehouseInfo();

        objCarWarehouse.ObjCar(CarType.getRandomCarType(),CompType.getRandomCompType());
        Car[] a1 = new Car[200];
        int j = 0;
        Car[] a2 = new Car[200];
        int k = 0;
        // выход из цикла по отсутствию или переизбытку автомобилей на складе
        while (true) {

            Random rnd1 = new Random(System.currentTimeMillis());
            int number1 = 0 + rnd1.nextInt(3 - 0 + 1); // разные диапазоны нужны для того, чтобы программа раньше закончилась
            for (int i = 0; i < number1; i++) {
                a1[j] = objCarWarehouse.ObjCar(CarType.getRandomCarType(),CompType.getRandomCompType()); // добавление автомобиля на склад + счетчик количества добавленных автомобилей
                Warehouse.getWarehouseInstance().addCar();
                j++;
            }


            Random rnd2 = new Random(System.currentTimeMillis());
            int number2 = 0 + rnd2.nextInt(4 - 0 + 1); // разные диапазоны нужны для того, чтобы программа раньше закончилась

            for (int i = 0; i < number2; i++) {
                a2[k] = objCarWarehouse.ObjCar(CarType.getRandomCarType(),CompType.getRandomCompType());// удаление автомобиля со склада + счетчик количества удаленных автомобилей
                Warehouse.getWarehouseInstance().removeCar();
                k++;
            }
        }

    }
}
