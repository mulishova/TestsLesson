package Lesson6;

public class Actions{

    public int sum (int one, int two) {
        return one + two;
    }

    public int sumWithException(Integer one, Integer two) throws IllegalArgumentException {
        if (one == null || two == null)
            throw new IllegalArgumentException();

        return one + two;
    }

    public int sub (int one, int two) {
        return one - two;
    }

    public int mul (int one, int two) {
        return one * two;
    }

    public int div (int one, int two) {
        return one / two;
    }

    /*public String run (String bmw, String mercedes) {
        return bmw + mercedes;
    }*/
}
