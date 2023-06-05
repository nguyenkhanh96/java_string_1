import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string to concatenate: ");
        String str2 = scanner.nextLine();

        String concatenatedString = concatenateStrings(str1, str2);

        System.out.println("Concatenated string: " + concatenatedString);
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1.concat(" ").concat(str2);
    }
}
