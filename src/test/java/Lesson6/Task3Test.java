package Lesson6;

import org.junit.jupiter.api.*;

public class Task3Test {

    Task3 task3;

    private static int[] ARRAY_FIRST = {1, 2, 3, 4, 5}; // true
    private static int[] ARRAY_SECOND = {1, 2, 3, 5, 6}; // false
    private static int[] ARRAY_THIRD = {2, 3, 4, 5, 6}; // false
    private static int[] ARRAY_FOURTH = {2, 3, 5, 6, 7}; // false

    public static boolean TRUE = true;
    public static boolean FALSE = false;

    public Task3Test() {
        task3 = new Task3();
    }

    @Test
    public void methodTest () {
        Assertions.assertNotNull(ARRAY_FIRST);
        Assertions.assertNotNull(ARRAY_SECOND);
        Assertions.assertNotNull(ARRAY_THIRD);
        Assertions.assertNotNull(ARRAY_FOURTH);
        Assertions.assertNotNull(TRUE);
        Assertions.assertNotNull(FALSE);

        Assertions.assertEquals(TRUE, task3.method(ARRAY_FIRST));
        Assertions.assertNotEquals(TRUE, task3.method(ARRAY_SECOND));
        Assertions.assertNotEquals(TRUE, task3.method(ARRAY_THIRD));
        Assertions.assertNotEquals(TRUE, task3.method(ARRAY_FOURTH));
    }
}