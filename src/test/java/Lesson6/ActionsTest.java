package Lesson6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

public class ActionsTest {

    Actions actions;

    private static Integer ONE;
    private static Integer TWO;
    private static final int SUM = 12;
    private static final int SUB = 8;
    private static final int MUL = 20;
    private static final int DIV = 5;
    private static final int WRONG = -12345;

    //@BeforeAll // запустить в самом начале
    public ActionsTest() {
        actions = new Actions();

        //Actions actions = new Mockito.mock(Actions.class);
    }

    //@BeforeEach // запускать перед каждым тестом
    //private void bar() {}

    /*@Test
    public void runTest() {
        String one = "1";
        String two = "2";
        String concat = one + two;
        String wrongConcat = two + one;

        Assertions.assertNotNull(actions);
        Assertions.assertEquals(concat, actions.run(one, two));
        Assertions.assertNotEquals(wrongConcat, actions.run(one, two));

        //actions.run();
    }*/

    //@AfterAll
    //@AfterEach
    //@After




    @BeforeEach
    public void init() {
        ONE = 10;
        TWO = 2;
        //Assertions.assertNotNull(actions);
        Assertions.assertNotNull(ONE);
        Assertions.assertNotNull(TWO);
    }

    @Test
    //@Disabled("Not added logic") // пропускаем
    public void sumTest() {
        Assertions.assertEquals(SUM, actions.sum(ONE, TWO));
        Assertions.assertNotEquals(WRONG, actions.sum(ONE, TWO));

        //Mockito.when(actionsImpl.sum(ONE, TWO)).thenReturn(SUM);
    }

    @CsvSource({
            "1, 2, 3",
            "-1, -1, -2",
            "0, 0, 0",
            "0, 3, 3",
            "3, -1, 2",
    })
    @ParameterizedTest
    public void sumManyTest (int a, int b, int sum) {
        Assertions.assertEquals(sum, actions.sum(a, b));
    }

    @Test
    public void sumWithExceptionTest () {
        ONE = null;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    actions.sumWithException(ONE, TWO);
                });

        ONE = 10;
        TWO = null;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    actions.sumWithException(ONE, TWO);
                });

        ONE = null;
        TWO = null;

        try {
            actions.sumWithException(ONE, TWO);
            Assertions.fail("Assertions Fail: IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }

        ONE = 10;
        TWO = 2;

        Assertions.assertEquals(SUM, actions.sum(ONE, TWO));
        Assertions.assertNotEquals(WRONG, actions.sum(ONE, TWO));
    }

    @Test
    @Timeout(value=10000, unit = TimeUnit.MICROSECONDS) // за сколько должен выполниться тест
    public void subTest() {
        Assertions.assertEquals(SUB, actions.sub(ONE, TWO));
        Assertions.assertNotEquals(WRONG, actions.sub(ONE, TWO));
    }

    @Test
    public void mulTest() {
        Assertions.assertEquals(MUL, actions.mul(ONE, TWO));
        Assertions.assertNotEquals(WRONG, actions.mul(ONE, TWO));
    }

    @Test
    public void divTest() {
        Assertions.assertEquals(DIV, actions.div(ONE, TWO));
        Assertions.assertNotEquals(WRONG, actions.div(ONE, TWO));
    }
}
