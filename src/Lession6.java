import java.util.Scanner;

public class Lession6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String uppercaseString = convertToUppercase(input);

        System.out.println("Uppercase string: " + uppercaseString);
    }

    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }
}
