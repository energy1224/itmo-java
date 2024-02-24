package com.company.project.lesson07.task02;

public class MyAcceptedFood {

    private double maxProtein;
    private double maxFat;

    private double maxCarbohydrate;

    private double maxCalories;


    public MyAcceptedFood(double maxProtein, double maxFat, double maxCarbohydrate) {
        if (maxCarbohydrate < 0) throw new IllegalArgumentException("Carbohydrate not less than 0");
        if (maxProtein < 0) throw new IllegalArgumentException("Protein not less than 0");
        if (maxFat < 0) throw new IllegalArgumentException("Fat not less than 0");
        this.maxProtein = maxProtein;
        this.maxFat = maxFat;
        this.maxCarbohydrate = maxCarbohydrate;
        this.maxCalories = 4 * this.maxCarbohydrate + 4 * this.maxProtein + 9 * this.maxFat;

    }

    public double getMaxCalories() {
        return maxCalories;
    }

    public boolean isAccepted(Food food) {
        if (food == null) throw new IllegalArgumentException("Food is not null");
        if (food.getCarbohydrate() > maxCarbohydrate) {
            System.out.println("Превышено колличество углеводов");
            return false;
        }
        if (food.getFat() > maxFat) {
            System.out.println("Превышено колличество жиров");
            return false;
        }
        if (food.getProtein() > maxProtein){
            System.out.println("Превышено колличество белков");
            return false;
        }
        if (food.getCalories()>maxCalories){
            System.out.println("Превышено колличество калорий");
            return false;
        }
            return true;
    }
}
