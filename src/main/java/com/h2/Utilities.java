package com.h2;

public class Utilities {
    public static long getLoanValue(String in) throws IllegalAccessException {
        long out = Long.MIN_VALUE;
        try {
            out = Long.parseLong(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted into a 'long' value. Exiting program.");
        }
        return out;
    }

    public static int getIntValue(String in) throws IllegalAccessException {
        int out = Integer.MIN_VALUE;
        try {
            Integer.parseInt(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted into a 'int' value. Exiting program");
        }
        return out;
    }

    public static float getFloatValue(String in) throws IllegalAccessException {
        float out = Float.MIN_VALUE;
        try {
            out = Float.parseFloat(in);
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(in + " cannot be converted into a 'float' value. Exiting program");
        }
        return out;
    }
}
