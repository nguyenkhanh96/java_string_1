import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        char character = getCharacterAtIndex(input, index);

        System.out.println("The character at position " + index + " is " + character);
    }

    public static char getCharacterAtIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        return str.charAt(index);
    }
}
