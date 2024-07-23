import java.util.Scanner;

public class SameOrNah {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String wordOne = scanner.nextLine();

        System.out.println("Enter the second word:");
        String wordTwo = scanner.nextLine();

        if (wordOne.equals(wordTwo)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }
    }
}
