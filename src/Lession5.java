import java.util.Scanner;

public class Lession5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String lowercaseString = convertToLowercase(input);

        System.out.println("Lowercase string: " + lowercaseString);
    }

    public static String convertToLowercase(String str) {
        return str.toLowerCase();
    }
}
