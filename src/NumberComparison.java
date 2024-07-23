import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        if (numberOne == numberTwo) {
            System.out.println("Numbers are the same");
        } else if (numberOne > numberTwo) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}
