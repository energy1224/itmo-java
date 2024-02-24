package lesson06;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {

        //     Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная трока палиндромом.

//        String string = "abba";
//        StringBuilder string1 = new StringBuilder(string);
//
//        String string2 = string1.reverse().toString();
//
//        if (string.equals(string2)) {
//            System.out.println("Палиндром");
//        } else {
//            System.out.println("He палиндром");
//        }

//
//        Создать два массива целых чисел на 5 элементов каждый.
//        Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.
//
//        1. Если число отрицательное, добавить его в первый массив.
//        2. Если число положительное, добавить его во второй массив.
//        3. Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0


        int[] num01 = new int[5];
        int[] num02 = new int[5];

        int index01 = 0;
        int index02 = 0;

//
//        Scanner scanner = new Scanner(System.in);
//        while (num01[num01.length - 1] == 0 || num02[num02.length - 1] == 0) {
//            int number = scanner.nextInt();
//            if (number < 0 && index01<num01.length) {
//                num01[index01]=number;
//                index01++;
//            }
//            if (number > 0 && index02<num02.length) {
//                num02[index02]=number;
//                index02++;
//            }
//            if(number==0)break;


//        Строку, введенную пользователем, приводить к виду: первая заглавная, остальные маленькие.
//                Пробелов в начале и конце строки быть не должно
//
//                Scanner scanner01 = new Scanner(System.in);
//                String word = scanner.next().trim();
//
//                String newWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
//                System.out.println(newWord);
//
//
//            }
//
//            String word01 = "ertyd";
//            String word02 = "detry";
//
//            char[] arr01 = word01.toCharArray();
//            char[] arr02 = word02.toCharArray();
//
//            for (int i = 0; i < arr02.length; i++) {
//
//            }


//            Scanner s = new Scanner(System.in);
//            int len = s.nextInt();
//            s.nextLine();
//            String[] words = new String[len];
//            boolean isContain = false;
//
//            while (words[len - 1] == null) {
//                String word = s.nextLine();
//                for (int i = 0; i < words.length; i++) {
//                    if (words[i].equals(word)) isContain = true;
//                }
//                if (isContain) {
//                    for (int i = 0; i < words.length; i++) {
//                        if (words[i] == null)
//                            words[i] = word;
//                    }


        String s01 = "abbyt";
        String s02 = "abbty";

        int[] ints = new int[26];
        for (int i = 0; i < s01.length(); i++) {
            ints[s01.charAt(i)]++;
            ints[s02.charAt(i)]--;
        }
        System.out.println(Arrays.toString(ints));


    }
}












