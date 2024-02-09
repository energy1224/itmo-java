package lesson02;

public class HomeTask {
    public static void main(String[] args) {
        //    объявите переменные для хранения информации об общем количестве
        //    писем и о количестве отправленных писем.
        //    Присвойте значения этим переменным.
        //    Выведите в консоль, сколько писем осталось отправить.
        int numOfLetters = 340;
        int sentLetters = 230;
        int unsentLetters = numOfLetters- sentLetters;
        System.out.println("Отсалось отправить: "+ unsentLetters +" писем");

   //     Объявить и инициализировать переменные для хранения времени
        //     (в часах) и расстояния (в километрах).
        //     Найти и вывести в консоль скорость,
        //     выраженную в метрах в секунду.
        double hours = 1.5;
        double kilometers = 122.4;
        double speed01 = kilometers/hours;
        double speed02= speed01/1000*3600;
        System.out.printf("%.2f", speed02);
        System.out.println();

       // Найти сумму цифр целого положительного двузначного числа.
        // Результат вывести в консоль.
        int num =59;
        int sum = num/10 + (num%10);
        System.out.println("Сумма цифр числа 59 =  "+sum);


//        Ответить на вопросы:
//        Какой тип у doubleResult01 и почему?
//
//        Чему равно значение doubleResult01 и почему?

        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;
        var doubleResult01 = (double) (num01 / num02);
        System.out.println(doubleResult01);
        //  doubleResult01 - double type
        // значение равно 1.0
        // т.к сначала выполняется целочисленное деление, потом приведение к типу double




    }
}
