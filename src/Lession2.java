import java.util.Scanner;

public class Lession2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int comparisonResult = compareIgnoreCase(str1, str2);

        if (comparisonResult < 0) {
            System.out.println("Chuỗi 1 xuất hiện trước Chuỗi 2 theo từ điển.");
        } else if (comparisonResult > 0) {
            System.out.println("Chuỗi 2 xuất hiện trước Chuỗi 1 theo từ điển.");
        } else {
            System.out.println("Chuỗi 1 và Chuỗi 2 bằng nhau về mặt từ điển.");
        }
    }

    public static int compareIgnoreCase(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }
}
