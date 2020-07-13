package com.stayready.assessment.week2.part01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            sb.append(' ');
        }

        return sb.substring(stringToBePadded.length()) + stringToBePadded;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            sb.append(' ');
        }

        return stringToBePadded + sb.substring(stringToBePadded.length());
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        return stringToBeRepeated.repeat(numberOfTimeToRepeat);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {

        if ((string != null) && (!string.equals("") && (string.matches("^[a-zA-Z]*$")))) {
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for( int i =0; i< string.length();i++){
            if(!Character.isDigit(string.charAt(i)));
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");

        Matcher matcher = pattern.matcher(string);

        if(!matcher.matches()){
            return false;
        }
        else {
            return true;
        }
    }
}
