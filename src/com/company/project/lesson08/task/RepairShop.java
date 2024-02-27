package com.company.project.lesson08.task;

public class RepairShop {
    private Vehicle[] repairList;
    private int amount;

    private int index;

    public RepairShop(int amount) {
        this.repairList = new Vehicle[amount];
        index = 0;
    }

    public void addVehicle(Vehicle newVehicle) {
        if (newVehicle == null) throw new IllegalArgumentException("Vehicle not null");
        if (index == repairList.length) {
            System.out.println("Repair shop is full");
        } else {
            repairList[index] = newVehicle;
            index++;
            System.out.println("Vehicle is added");
        }
    }

    public void repairAll() {
        for (int i = 0; i < index; i++) {
            repairList[i].repair();
            repairList[i] = null;
        }
    }

    public void printRepairShop(){
        for (Vehicle vehicle : repairList) {
            System.out.println(vehicle);

        }
    }
}
