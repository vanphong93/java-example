package universitymanagement;

import java.util.Scanner;

/**
 * Util.
 *
 * @author hasu
 */
public final class Util {

    private Util() {
    }

    public static float MIN_SCORE = 0F;
    public static float MAX_SCORE = 10F;

    public static String inputString(String message, boolean allowBlank) {
        Scanner sc = new Scanner(System.in);
        if (allowBlank) {
            message += "(allow blank): ";
        } else {
            message += "(not blank): ";
        }
        String str;
        do {
            System.out.print(message);
            str = sc.nextLine();
            if (allowBlank && str.isBlank()) {
                return "";
            }
        } while (str.isBlank());
        return str;
    }

    public static Integer inputInteger(String message, boolean allowBlank) {
        Integer inputVal = null;
        String str;
        do {
            str = inputString(message, allowBlank);
            if (allowBlank && str.isBlank()) {
                return null;
            }
            try {
                inputVal = Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.println(str + "is not a number");
            }
        } while (str.isBlank());
        return inputVal;
    }
    
    public static Float inputFloat(String message, boolean allowBlank) {
        Float inputVal = null;
        String str;
        do {
            str = inputString(message, allowBlank);
            if (allowBlank && str.isBlank()) {
                return null;
            }
            try {
                inputVal = Float.parseFloat(str);
            } catch (NumberFormatException ex) {
                System.out.println(str + "is not a number");
            }
        } while (str.isBlank());
        return inputVal;
    }
}
