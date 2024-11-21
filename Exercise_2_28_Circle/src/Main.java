import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r;

        System.out.print("Enter with the radius of the circle: ");
        r = input.nextInt();

        System.out.printf("The diameter of the circle is %d%n", 2*r);
        System.out.printf("The circumference of the circle is %f%n", 2*Math.PI*r);
        System.out.printf("The area of the circle is %f%n", 2*3.14159*r*r);

    }
}