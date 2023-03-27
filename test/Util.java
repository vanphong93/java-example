package test;

import java.util.Scanner;

public final class Util {

    private static final String IGNORE_CASE_PATTERN = "(?i)";
    private Util() {
    }

    public static String inputString(String message, boolean allowEmpty) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print(message + ": ");
            str = sc.nextLine();
        } while (!allowEmpty && str.isBlank());
        return str.trim();
    }

    public static Integer inputInteger(String message, Integer minValue, Integer maxValue) {
        Integer inputVal = null;
        do {
            try {
                inputVal = Integer.valueOf(Util.inputString(message, false));
            } catch (NumberFormatException ex) {
                inputVal = null;
            }
        } while (inputVal == null
                || (minValue != null && minValue.compareTo(inputVal) > 0)
                || maxValue != null && maxValue.compareTo(inputVal) < 0);
        return inputVal;
    }

    /**
     * Input integer number.
     *
     * @param message string message.
     * @param minValue the minimum value.
     * @param maxValue the maximum value.
     * @param allowEmpty flag to allow the user to enter an empty string.
     * @return null if the user inputs an empty string. Otherwise, return the
     * integer inputted.
     */
    public static Integer inputInteger(String message, Integer minValue, Integer maxValue, boolean allowEmpty) {
        Integer inputVal = null;
        String sVal = "";
        do {
            try {
                sVal = Util.inputString(message, allowEmpty);
                if (sVal.isBlank()) {
                    inputVal = null;
                } else {
                    inputVal = Integer.valueOf(sVal);
                }
            } catch (NumberFormatException ex) {
                inputVal = null;
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (!(allowEmpty && sVal.isBlank())
                && (inputVal == null
                || minValue != null && minValue.compareTo(inputVal) > 0
                || maxValue != null && maxValue.compareTo(inputVal) < 0));
        return inputVal;
    }

    public static Float inputFloat(String message, Float minValue, Float maxValue) {
        Float inputVal = null;
        do {
            try {
                inputVal = Float.valueOf(Util.inputString(message, false));
            } catch (NumberFormatException ex) {
                inputVal = null;
            }
        } while (inputVal == null
                || (minValue != null && minValue.compareTo(inputVal) > 0)
                || maxValue != null && maxValue.compareTo(inputVal) < 0);
        return inputVal;
    }

    public static Float inputFloat(String message, Float minValue, Float maxValue, boolean allowEmpty) {
        Float inputVal = null;
        String sVal = "";
        do {
            try {
                sVal = Util.inputString(message, allowEmpty);
                if (sVal.isBlank()) {
                    inputVal = null;
                } else {
                    inputVal = Float.valueOf(sVal);
                }
            } catch (NumberFormatException ex) {
                inputVal = null;
            }
        } while (!(allowEmpty && sVal.isBlank())
                && (inputVal == null
                || minValue != null && minValue.compareTo(inputVal) > 0
                || maxValue != null && maxValue.compareTo(inputVal) < 0));
        return inputVal;
    }

    public static boolean validateStringPattern(String str, String regex, boolean ignoreCase) {
        if (str != null && regex != null) {
            if (ignoreCase) {
                regex = Util.IGNORE_CASE_PATTERN + regex;
            }
            return str.matches(regex);
        }
        return false;
    }
    //delete the item from array
    // public static student[] removeItem(student[] arr, int index)
    // {
 
    //     // If the array is empty
    //     // or the index is not in array range
    //     // return the original array
    //     if (arr == null || index < 0
    //         || index >= arr.length) {
 
    //         return arr;
    //     }
 
    //     // Create another array of size one less
    //     student[] anotherArray = new student[arr.length - 1];
 
    //     // Copy the elements except the index
    //     // from original array to the other array
    //     for (int i = 0, k = 0; i < arr.length; i++) {
 
    //         // if the index is
    //         // the removal element index
    //         if (i == index) {
    //             continue;
    //         }
 
    //         // if the index is not
    //         // the removal element index
    //         anotherArray[k++] = arr[i];
    //     }
 
    //     // return the resultant array
    //     return anotherArray;}
}
