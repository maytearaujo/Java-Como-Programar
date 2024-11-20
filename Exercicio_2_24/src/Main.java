import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                number3,
                number4,
                number5;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        number5 = input.nextInt();

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
            System.out.printf("%d is the larger%n", number1);
        if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
            System.out.printf("%d is the larger%n", number2);
        if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
            System.out.printf("%d is the larger%n", number3);
        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
            System.out.printf("%d is the larger%n", number4);
        if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4)
            System.out.printf("%d is the larger%n", number5);

        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
            System.out.printf("%d is the larger%n", number1);
        if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5)
            System.out.printf("%d is the larger%n", number2);
        if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5)
            System.out.printf("%d is the larger%n", number3);
        if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5)
            System.out.printf("%d is the larger%n", number4);
        if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4)
            System.out.printf("%d is the larger%n", number5);

    }
}