package com.company.project.lesson08.task;

public class Train extends Vehicle {

    private int carriages;

    private boolean isClimateControl;


    public Train(int number, int levelOfWare, int carriages, boolean isClimateControl) {
        super(number, levelOfWare);
        this.carriages = carriages;
        this.isClimateControl = isClimateControl;
    }

    @Override
    public void repair() {
        if (carriages > 7) {
            super.repair();
        } else {
            if (levelOfWare > 1)
                levelOfWare -= 2;
            else levelOfWare = 0;
        }
    }
}