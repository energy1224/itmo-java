package com.company.project.lesson08;

public class Unit {

   protected int healthPoint;
    private int speedPoint;
    protected int initialHealthPoint;

    public Unit(int healthPoint) {
        this.healthPoint = healthPoint;
        initialHealthPoint=healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getSpeedPoint() {
        return speedPoint;
    }

    public void rest(){
        if(healthPoint > 0 && initialHealthPoint > healthPoint ){
            healthPoint++;

        }
    }
}
