package Lesson6;

import org.junit.jupiter.api.*;

public class Task2Test {

    Task2 task2;

    private static int[] ARRAY_FIRST = {1, 2, 3, 4, 5, 6, 5, 4, 5, 6, 7, 8, 9};
    private static int[] ARRAY_SECOND = {5, 6, 7, 8, 9};

    private static int[] WRONG_ARRAY_FIRST = {1, 2, 3, 5, 6, 7, 8, 9};
    private static int[] WRONG_ARRAY_SECOND = {};

    private static int[] ARRAY_2_FIRST = {1, 2, 3, 4};
    private static int[] ARRAY_2_SECOND = {};

    public Task2Test() {
        task2 = new Task2();
    }

    @Test
    public void methodTest () {
        Assertions.assertNotNull(ARRAY_FIRST);
        Assertions.assertNotNull(ARRAY_SECOND);
        Assertions.assertNotNull(WRONG_ARRAY_FIRST);
        Assertions.assertNotNull(WRONG_ARRAY_SECOND);
        Assertions.assertNotNull(ARRAY_2_FIRST);
        Assertions.assertNotNull(ARRAY_2_SECOND);

        Assertions.assertArrayEquals(ARRAY_SECOND, task2.method(ARRAY_FIRST));
        Assertions.assertArrayEquals(ARRAY_2_SECOND, task2.method(ARRAY_2_FIRST));

        Assertions.assertThrows(RuntimeException.class, () -> task2.method(WRONG_ARRAY_FIRST));
        Assertions.assertThrows(RuntimeException.class, () -> task2.method(WRONG_ARRAY_SECOND));
    }
}
