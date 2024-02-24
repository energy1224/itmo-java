package com.company.project.lesson07.task01;

public class Alpinist {

    private String name;

    private String address;

    public Alpinist(String name, String address) {
        if(name.length()<3)throw new IllegalArgumentException("Имя д.б. не менее 3 символов");
        if(address.length()<5)throw new IllegalArgumentException("Адрес д.б. не менее 5 символов");
        this.name = name;
        this.address = address;
    }
}

