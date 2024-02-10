package lesson03.homeTask;

import java.util.Random;

public class Task {
    public static void main(String[] args) {

        // тернарный оператор
        int cost = 1345;
        double finalCost = cost > 1000 ? cost * 0.9 : cost;
        System.out.println(finalCost);

        //  Решите следующую задачу, используя switch:
        //  Напишите программу, которая выводит в консоль
        //  количество квартир на выбранном этаже.
        //  1 и 2 этажи - 7 квартир
        //  3 и 4 этажи - 5 квартир
        //  5 этаж - 2 квартиры
        //  Номер этажа хранится в переменной floorNumber.
        int floorNumber = 4;
        switch (floorNumber) {
            case 1, 2 -> System.out.println("7 apartments");
            case 3, 4 -> System.out.println("5 apartments");
            case 5 -> System.out.println("2 apartments");
        }
//        Задача #1 на Math.random() и ветвление
//        Самостоятельно изучить Math.random() для генерации псевдослучайных чисел.
//        Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
//        в интервал (25;200) и выводить результат в консоль.
//        Примеры работы программы: Число 345 не содержится в интервале (25;200) Число 110 содержится в интервале (25;200)

        int num = 10 + (int) (Math.random() * 501);
        if (num > 25 && num < 200) System.out.println("Число " + num + " попало в заданный диапазон");
        else System.out.println("Число " + num + " не попало в заданный диапазон");


//        Задача #2 на if else
//        Даны переменные x и y - координаты точки на плоскости.
//        Необходимо определить четверть координатной плоскости, которой принадлежит данная точка. Результат вывести в консоль.
//        Если обе координаты положительны, точка принадлежит первой четверти.
//                Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
//                Если обе координаты отрицательны, точка принадлежит третьей четверти.
//                Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.
        int x = 5;
        int y = -4;
        if (x > 0 && y > 0) System.out.println("First quarter");
        else if (x < 0 && y > 0) System.out.println("Second quarter");
        else if (x < 0 && y < 0) System.out.println("Third quarter");
        else System.out.println("Forth quarter");


        //        Задача #3 на switch
//        Дана переменная monthNumber, которая хранит порядковый номера месяца.
//        И переменная isLeap, которая хранит информацию о том, является ли год високосным.
//               Написать программу, которая в зависимости от значения monthNumberвыводит
//               в консоль количество дней в этом месяце.
//               Необходимо рассмотреть два случая: год не является високосным и год является високосным.
        int monthNumber = 2;
        boolean isLeap = false;
        switch (monthNumber) {
            case 2 -> {
                if (isLeap) System.out.println("29 days");
                else System.out.println("28 days");
            }
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
        }

//        Задача #4 на switch
//        Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
//
//                Если номер купона - 1111, 4444 или 9999 - скидка 10%,
//                Если номер купона - 3333 или 7777 - скидка 20%,
//                Если номер купона - 5555 - скидка 30%.
//        В остальных случаях скидка не предусмотрена.
//        Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена. Вывести значение resultSum в консоль.
        int couponNumber = 5550;
        double resultSum = 100;
        resultSum = switch (couponNumber) {
            case 1111, 4444, 9999 -> {
                System.out.println("скидка 10%");
                yield resultSum*= 0.9;
            }
            case 3333, 7777 -> {
                System.out.println("скидка 10%");
                yield resultSum*= 0.8;
            }
            case 5555 -> {
                System.out.println("скидка 10%");
                yield resultSum *= 0.7;
            }
            default -> {
                System.out.println("Скидка не предусмотрена");
                yield resultSum;

            }
        };
        System.out.println("Цена с учетом скидки: "+ resultSum);


    }
}



