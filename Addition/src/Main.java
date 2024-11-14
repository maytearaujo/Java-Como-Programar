import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        //System.out.println("The sum is: " + sum);
        System.out.printf("%s%d", "The sum is: ", sum);
    }
}