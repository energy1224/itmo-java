package com.company.project.lesson07.task01;

public class Mountain {

    private String name;

    private String country;

    private int height;

    public Mountain(String name, String country, int height) {
        if(name.length()<4)
            throw new IllegalArgumentException("Название д.б. не менее 4 символов");
        if (country.length()<4)
            throw new IllegalArgumentException("Страна д.б. не менее 4 символов");
        if(height<100)
            throw new IllegalArgumentException("Высота д.б. не менее 100 метров");
        this.name = name;
        this.country = country;
        this.height = height;
    }
}
