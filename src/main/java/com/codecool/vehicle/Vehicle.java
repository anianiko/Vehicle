package com.codecool.vehicle;

abstract class Vehicle {
    protected String licensePlate = "";
    private String color = "";

    private final boolean hasChip = true;

    Vehicle(String color) {
        this.color = color;
        licensePlate = "-------";
    }

    Vehicle(String color, String licensePlate) {
        this.color = color;
        this.licensePlate = licensePlate;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    String getColor() {
        return color;
    }

    boolean isHasChip() {
        System.err.println("CHIP has been looked at!!!");
        return hasChip;
    }

    void turnLeft() {
        System.out.println("The Vehicle turns left.");
    }

    void turnRight() {
        System.out.println("The Vehicle turns right.");
    }
}