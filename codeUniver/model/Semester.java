package model;

import universitymanagement.Util;

/**
 * Semester.
 *
 * @author hasu
 */
public enum Semester {
    HK1,
    HK2,
    HK3,
    HK4,
    HK5,
    HK6,
    HK7,
    HK8;

    public static Semester input(boolean allowBlank) {
        StringBuilder sb = new StringBuilder();
        for (Semester value : values()) {
            sb.append("|").append(value);
        }
        String message = "Input semester (" + sb.toString().substring(1) + "): ";
        Semester semester = null;
        do {
            String str = Util.inputString(message, allowBlank);
            if (allowBlank && str.isBlank()) {
                return null;
            }
            try {
                semester = valueOf(str.trim().toUpperCase());
            } catch (Exception ex) {

            }
        } while (semester == null);
        return semester;
    }
}
