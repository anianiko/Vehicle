package com.codecool.vehicle;

public class VehicleMerchant {

    public static void main(String[] args) {

        Car car = new Car("red", "ABC-123");
        car.turnLeft();
        car.turnRight();
        System.out.println(car.getColor());
        System.out.println(car.licensePlate);
        car.licensePlate = "ABC-456";
        System.out.println(car.licensePlate);

        Motorbike motorbike = new Motorbike("green");
        motorbike.turnLeft();
        motorbike.turnRight();
    }
}
