import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,
                y,
                z,
                result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third interger: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d", result);
    }
}