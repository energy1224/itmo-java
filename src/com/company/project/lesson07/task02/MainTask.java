package com.company.project.lesson07.task02;

public class MainTask {

    public static void main(String[] args) {

        Food carrot = new Food("Carrot",0.67,0.0,105.0);
        Food beef = new Food("Beef", 345.8,234.9,567.9);
        Food pasta = new Food("Pasta", 245.9,290.34,677.7);
        Food butter = new Food("Butter", 0.96,965.9,10.9);

        MyAcceptedFood myAcceptedFood01 = new MyAcceptedFood(0.3,300.0,600.0);

        System.out.println("carrot "+ carrot.getCalories()+" калорий");

        System.out.println("Разрешено "+ myAcceptedFood01.getMaxCalories()+ " калорий");

        System.out.println(myAcceptedFood01.isAccepted(carrot));




    }
}
