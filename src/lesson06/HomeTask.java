package lesson06;


//Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
// Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
// Использовать алгоритм скользящего окна.

import java.util.Arrays;

public class HomeTask {
    public static void main(String[] args) {

        //1. Отсортировать массив пузырьковой сортировкой

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) array[i] = (int) (Math.random() * 100);
        System.out.println("Array " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array " + Arrays.toString(array));


        // 2. Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
// Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
// Использовать алгоритм скользящего окна.

        int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44};
        int subMassiveLength=4;

        int maxSum=0;
        int subMassiveSum=0;
        int start;
        int end=0;


        for (start = 0; start< task02.length; start++) {
            subMassiveSum +=task02[start];
            if (start==subMassiveLength-1+end){
                if(subMassiveSum>maxSum) {
                    maxSum = subMassiveSum;
                }
                subMassiveSum-=task02[end];
                end++;
            }

        }
        System.out.println("Максимальная сумма четырёх смежных целых чисел " + maxSum);


    }
}
