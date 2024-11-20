import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x,
                y,
                z;

        System.out.print("Enter the first interger: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        System.out.printf("The sum is %d%n", (x + y + z));
        System.out.printf("The average is %d%n", (x + y + z) / 3);
        System.out.printf("The product is %d%n", x * y * z);

        if (x < y && x < z)
            System.out.printf("%d is smaller%n", x);

        if (y < x && y < z)
            System.out.printf("%d is smaller%n", y);

        if (z < x && z < y)
            System.out.printf("%d is smaller%n", z);

        if (x > y && x > z)
            System.out.printf("%d is larger%n", x);

        if (y > x && y > z)
            System.out.printf("%d is larger%n", y);

        if (z > x && z > y)
            System.out.printf("%d is larger%n", z);
    }
}