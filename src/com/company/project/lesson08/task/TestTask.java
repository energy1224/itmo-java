package com.company.project.lesson08.task;

public class TestTask {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(34,5);

        Train train =new Train(56,7,9,true);

        Scooter scooter = new Scooter(45,3,true);

        RepairShop repairShop = new RepairShop(7);

        repairShop.printRepairShop();

        repairShop.addVehicle(vehicle);
        repairShop.addVehicle(train);
        repairShop.addVehicle(scooter);

        repairShop.printRepairShop();
        System.out.println();

        repairShop.repairAll();

        repairShop.printRepairShop();







    }
}
