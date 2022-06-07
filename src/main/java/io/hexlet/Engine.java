package io.hexlet;

import java.util.Scanner;

public class Engine {
    public static void run() {
        System.out.println("Welcome to Fizz Buzz!");
        System.out.println("Submit a number and get an answer!");
        var scaner = new Scanner(System.in);

        while (true) {
            System.out.print("Number: ");
            var number = scaner.nextInt();
            var result = FizzBuzz.determine(number);
            System.out.println(result);
        }
    }
}
