package com.company.project.lesson07.task02;

public class Food {
    private String name;
    private double protein;
    private double fat;
    private double carbohydrate;
    private double calories;

    public Food(String name, double carbohydrate) {
        this.name = name;
        setCarbohydrate(carbohydrate);
        this.calories = 4*this.protein + this.fat*9 + this.carbohydrate*4;
    }

        public Food(String name, double fat, double protein) {
        this.name = name;
        setFat(fat);
        setProtein(protein);
        this.calories = 4*this.protein + this.fat*9 + this.carbohydrate*4;
    }

    public Food(String name) {
        this.name = name;
        this.calories = 4*this.protein + this.fat*9 + this.carbohydrate*4;
    }

    public Food(String name, double protein, double fat, double carbohydrate) {
        this.name = name;
        setProtein(protein);
        setFat(fat);
        setCarbohydrate(carbohydrate);
        this.calories = 4*this.protein + this.fat*9 + this.carbohydrate*4;
    }


    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        if(protein<0)throw new IllegalArgumentException("Protein not less  than zero");
        this.protein = protein;
    }

    public double getFat() {
        if(fat<0)throw new IllegalArgumentException("Fat not less  than zero");
        return fat;
    }

    public void setFat(double fat) {
        if(fat<0)throw new IllegalArgumentException("Fat not less  than zero");
        this.fat = fat;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        if(carbohydrate<0)throw new IllegalArgumentException("Carbohydrate not less  than zero");
        this.carbohydrate = carbohydrate;
    }

    public double getCalories() {
        return calories;
    }


    }

