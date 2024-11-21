import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1,
                number2;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        if (number1 % number2 == 0)
            System.out.printf("%d is multiple to %d and the result is %d!", number1, number2, (number1*number2));
    }
}