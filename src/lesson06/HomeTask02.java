package lesson06;

public class HomeTask02 {
    public static void main(String[] args) {
        //    1. Дан массив целых чисел и целочисленная переменная (target).
        //    Найти и вывести в консоль два элемента массива, которые в сумме дают target.

        // Решение 1
        int[] arr = {3, 2, 4, 7, 5, 21};
        int target = 9;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                target = target - arr[i];
                firstNum = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (target - arr[j] == 0) {
                        secondNum = arr[j];
                        break;
                    }
                }
                if (secondNum > 0) break;
                target = target + arr[i];
            }
        }
        System.out.println(firstNum + " " + secondNum);

        // решение 2

        target = 9;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    firstNum = arr[i];
                    secondNum = arr[j];
                }
                if (target == firstNum + secondNum) break;
            }
        }
        System.out.println(firstNum + " " + secondNum);


        //  Дан массив целых чисел. Изменить его таким образом,
        //    чтобы вначале стояли только уникальные элементы
        //    (порядок следования элементов менять нельзя).

        int[] array = {2, 3, 5, 2, 3, 5, 10, 34, 19, 3};
        int[] testArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j >=0; j--) {
                System.out.println(array[i]+" "+array[j]);
             //   if(array[i]!=array[j]){

                }

            }



        }


    }














