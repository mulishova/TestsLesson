package Lesson6;

// Написать метод, которому в качестве аргумента передается не пустой одномерный
// целочисленный массив. Метод должен вернуть новый массив, который получен путем
// вытаскивания из исходного массива элементов, идущих после последней четверки.
// Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо
// выбросить RuntimeException. Написать набор тестов для этого метода
// (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 5, 6, 7, 8, 9}; // 5, 6, 7, 8, 9
        int[] errorArr = {1, 2, 3, 5, 6, 7, 8, 9}; // нет 4

        System.out.println(method(arr));
        System.out.println(method(errorArr));
    }

    public static int[] method(int[] a) throws RuntimeException {
        int[] arr;
        int index = 0;

        String str = Arrays.toString(a);

        if (str.contains(String.valueOf(4))) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 4)
                    index = i;
            }

            arr = new int[a.length - index - 1];

            arr = Arrays.copyOfRange(a, index + 1, a.length);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }

            return arr;
        } else {
            throw new RuntimeException("Array don't contain 4");
        }
    }
}