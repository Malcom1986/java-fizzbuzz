package io.hexlet;

import picocli.CommandLine.Command;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@Command(
        name = "fizzbuzz",
        version = "1.0.0",
        description = "Determine if number iz fizz or buzz",
        mixinStandardHelpOptions = true
)
public class App implements Callable<Integer> {

    @Override
    public final Integer call() throws Exception {
        Engine.run();
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
