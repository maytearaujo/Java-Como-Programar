import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a five-digit number: ");
        number = input.nextInt();

        if ( number % 10000 >= 0)
            System.out.printf("%d   %d   %d   %d   %d",
                    (number / 10000),
                    ((number % 10000) / 1000),
                    (((number % 10000) % 1000) / 100),
                    ((((number % 10000) % 1000) % 100)/ 10),
                    ((((number % 10000) % 1000) % 100) % 10)
            );
                    /*((number % 10000) / 1000),
                    (((number % 10000) % 1000) / 100)),
                    ((((number % 10000) % 1000) % 100) / 10));*/

    }
}