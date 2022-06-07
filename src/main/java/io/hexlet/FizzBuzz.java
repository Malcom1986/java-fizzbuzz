package io.hexlet;

public class FizzBuzz {

    public static final int FIZZ_DIVIDER = 3;
    public static final int BUZZ_DIVIDER = 5;
    public static String determine(int number) {
        var hasFizz = number % FIZZ_DIVIDER == 0;
        var hasBuzz = number % BUZZ_DIVIDER == 0;
        var fizzPart = hasFizz ? "Fizz" : "";
        var buzzPart = hasBuzz ? "Buzz" : "";
        return hasFizz || hasBuzz ? fizzPart + buzzPart : String.valueOf(number);
    }
}
