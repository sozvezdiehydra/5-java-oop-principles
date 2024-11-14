package com.example.task04;
import java.time.temporal.ChronoUnit;

public class Task04Main {
    public static void main(String[] args) {
        Logger test = new Logger("i wanna eat");
        test.addHandler(new ConsoleHandler());
        test.addHandler(new FileHandler());
        test.addHandler(new RotationHandler("E:\\DevLabs\\Lab5", ChronoUnit.MILLIS));
        for (int i = 0; i < 50; i++){
            test.error("i wanna sleep");}
    }
}
