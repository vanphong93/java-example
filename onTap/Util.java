package onTap;
import java.util.Scanner;

public final class Util {
    private Util() {
    }

    public static String inpuString(String message, boolean allowEmpty) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.println(message + ":");
            str = scanner.nextLine();

        } while (!allowEmpty && str.isBlank());
        return str.trim();
    }

    public static Integer inpuInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println(message);
            number = scanner.nextInt();

        } while (number > 0);
        return number;
    }
}
