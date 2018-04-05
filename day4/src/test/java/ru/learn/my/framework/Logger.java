package ru.learn.my.framework;

/**
 * Created by user on 05.04.2018.
 */
public class Logger {

    private Logger() {}

    private static void typeMessage(String prefix, String tab, String message) {
        System.out.println(tab + prefix + message);
    }
    public static void logTest(String message){
        typeMessage("[Test]", "", message);
    }
    public static void logCore(String message) {
        typeMessage("[Core]", "", message);
    }
    public static void logPage(String message){
        typeMessage("[Page]", "\t", message);
    }
    public static void logElement(String message){
        typeMessage("[Element]", "\t\t", message);
    }

}
