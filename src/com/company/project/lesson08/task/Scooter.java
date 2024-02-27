package com.company.project.lesson08.task;

public class Scooter extends Vehicle {


    private int wheels = 2;

    private String type;

    private boolean isElectric;

    public Scooter(int number, int levelOfWare, boolean isElectric) {
        super(number, levelOfWare);
        this.isElectric = isElectric;
        this.wheels=2;
        this.type="urban";

    }

    @Override
    public void repair() {
        if (isElectric) {
            if (levelOfWare > 1)
                levelOfWare -= 2;
            else levelOfWare = 0;
        } else {
            if (levelOfWare > 2)
                levelOfWare -= 3;
            else levelOfWare = 0;
        }
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public boolean isElectric() {
        return isElectric;
    }
}

