import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if ( number % 2 == 0)
            System.out.printf("%d is even!", number);

        if ( number %2 != 0)
            System.out.printf("%d is odd", number);
    }
}