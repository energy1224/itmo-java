package lesson05;

public class Lesson05 {
    public static void main(String[] args) {
        // верхний и нижний регистр
        String string01 = " JaVa ";
        String  string02 = " deVEloPEr ";
        String upperString = string01.toUpperCase();
        String lowerString = string02.toLowerCase();
        System.out.println(upperString);
        System.out.println(lowerString);


        // удаление пробелов с начала и конца строки
        // проверка на последовательность символов в начале и конце строки
        // замена символов
        // string01.startsWith();
        // "str".startsWith();
        // upperString.strip().startsWith()
        // trim U+0020
        // " JaVa " toUpperCase " JAVA " strip "JAVA"
        if (upperString.strip().startsWith("JA") &&
                lowerString.trim().endsWith("er")) {
            System.out.println(upperString.replace("A", "!") +
                    lowerString.repeat(2));
        }
    }
}
