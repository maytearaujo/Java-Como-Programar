import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Enter the first number: ");
        x = input.nextInt();

        System.out.print("Enter the second number: ");
        y = input.nextInt();

        System.out.printf("The sum of %d and %d is %d%n", x, y, (x + y));
        System.out.printf("The product of %d and %d is %d%n", x, y, (x * y));
        System.out.printf("The difference of %d and %d is %d%n", x, y, (x - y));
        System.out.printf("The quotient of %d and %d is %d%n", x, y, (x / y));
    }
}