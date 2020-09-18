package Lesson6;

// Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
// четверки или единицы, то метод вернет false; Написать набор тестов для этого метода
// (по 3-4 варианта входных данных)

public class Task3 {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 4, 5}; // true
        int[] arr_2 = {1, 2, 3, 5, 6}; // false
        int[] arr_3 = {2, 3, 4, 5, 6}; // false
        int[] arr_4 = {2, 3, 5, 6, 7}; // false

        System.out.println(method(arr_1));
        System.out.println(method(arr_2));
        System.out.println(method(arr_3));
        System.out.println(method(arr_4));
    }

    public static boolean method(int[] a) {
        if (a.length > 1 ) {
            boolean consist_1 = false;
            boolean consist_4 = false;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == 1)
                    consist_1 = true;
                else if (a[i] == 4)
                    consist_4 = true;
            }

            return consist_1 && consist_4;
        }

        return false;
    }
}