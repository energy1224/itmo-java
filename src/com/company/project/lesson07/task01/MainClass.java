package com.company.project.lesson07.task01;

public class MainClass {
    public static void main(String[] args) {

        Mountain kazbek = new Mountain("Kazbek","Russia", 3700);
        Mountain ararat =  new Mountain("Ararat", "Armenia", 4300);
        Mountain fudzi = new Mountain("Fudzi", "Japan", 2500);

        Alpinist alpinist01 = new Alpinist("Stive", "Portugal");
        Alpinist alpinist02 = new Alpinist("Tom", "Canada");
        Alpinist alpinist03 = new Alpinist("Silvia", "Greece");
        Alpinist alpinist04 = new Alpinist("Natalia", "Belarus");
        Alpinist alpinist05 = new Alpinist("Victor", "Russia");

        Group group01 = new Group(kazbek);
        group01.addMember(alpinist01);
        group01.addMember(alpinist02);
        group01.addMember(alpinist03);
        group01.isUnderway();

        Group group02 =new Group(fudzi);
        group02.addMember(alpinist04);
        group02.addMember(alpinist05);
        group02.isUnderway();

        Group group03 = new Group(ararat);
        group03.addMember(alpinist01);
        group03.addMember(alpinist05);
        group03.isUnderway();








    }
}
