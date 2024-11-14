package com.example.task01;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {

    public enum Level{
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private String name;
    private static Level currentLevel = Level.DEBUG;
    private static final HashMap<String, Logger> loggers = new HashMap<>();

    public Logger(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLevel(Level level) {
        currentLevel = level;
    }

    public static Level getLevel(){
        return currentLevel;
    }

    public static Logger getLogger(String name){
        return loggers.computeIfAbsent(name, Logger::new);
    }

    private void logMessage(Level level, String message){
        if(level.ordinal() >= currentLevel.ordinal()){
            SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            String dateTime = date.format(new Date());
            System.out.println("[" + level + "] " + dateTime + " " + name + " - " + message);
        }
    }

    public void debug(String message){
        logMessage(Level.DEBUG, message);
    }

    public void debug(String format, Object... args){
        logMessage(Level.DEBUG, String.format(format, args));
    }

    public void info(String message){
        logMessage(Level.INFO, message);
    }

    public void info(String format, Object... args){
        logMessage(Level.INFO, String.format(format, args));
    }

    public void warning(String message) {
        logMessage(Level.WARNING, message);
    }

    public void warning(String format, Object... args) {
        logMessage(Level.WARNING, String.format(format, args));
    }

    public void error(String message) {
        logMessage(Level.ERROR, message);
    }

    public void error(String format, Object... args) {
        logMessage(Level.ERROR, String.format(format, args));
    }

    public void log(Level level, String message){
        logMessage(level, message);
    }

    public void log(Level level, String format, Object... args){
        logMessage(level, String.format(format, args));
    }
}