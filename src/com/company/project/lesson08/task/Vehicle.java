package com.company.project.lesson08.task;

public class Vehicle {
    protected int number;
    protected int levelOfWare;
    private int maxSpeed;

    public Vehicle(int number, int levelOfWare) {
        if(levelOfWare<0)throw new IllegalArgumentException("уровень износа д.б. не меньше нуля");
        if(number<0)throw new IllegalArgumentException("номер  д.б. положительное число");
        this.number = number;
        this.levelOfWare = levelOfWare;
        maxSpeed=120;

    }

    public void repair(){
        if(levelOfWare>0)
            levelOfWare--;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
