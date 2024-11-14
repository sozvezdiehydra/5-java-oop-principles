package com.example.task01;

import sun.rmi.runtime.Log;

public class Task01Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("i wanna eat");
        Logger logger2 = Logger.getLogger("i wanna eat");

        //System.out.println(logger1 == logger2);

        logger1.setLevel(Logger.Level.INFO);
        System.out.println(Logger.getLevel());

        logger1.log(Logger.Level.ERROR, "i wanna eat");
        logger2.log(Logger.Level.INFO, "info");
        logger2.log(Logger.Level.DEBUG, "debug");
        logger2.log(Logger.Level.ERROR, "Error with code: %d", 404);

        logger1.info("Formatted message: %s", "INFO");
        logger2.info("Error with code: %d", 404);

    }
}
