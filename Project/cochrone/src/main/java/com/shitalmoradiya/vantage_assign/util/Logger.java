package com.shitalmoradiya.vantage_assign.util;

public class Logger {

    // Log String with error prefix
    public static void logE(String message, Exception e) {
        String errorMessage = e.getMessage();
        if(errorMessage == null)
            errorMessage = "";
        System.out.println("ERROR: " + message + "\n" + errorMessage);
        e.printStackTrace();
    }

    // Log String with debug prefix
    public static void logD(String s) {
        System.out.println("DEBUG: " + s);
    }

    // Log String with no prefix
    public static void logI(String s) {
        System.out.println(s);
    }

}
