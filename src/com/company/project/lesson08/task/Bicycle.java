package com.company.project.lesson08.task;

public class Bicycle extends Vehicle{

    private int wheels;

    private String type;


    public Bicycle(int number, int levelOfWare) {
        super(number, levelOfWare);
        this.wheels = 2;
        this.type = "urban";
    }
    @Override
    public void repair() {
        super.repair();
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
