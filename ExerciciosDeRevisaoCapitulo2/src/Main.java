import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c,
                thisIsAVariable,
                q76354,
                number;

        int value;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number ");
        number = input.nextInt();

        System.out.print("Enter other integer number ");
        value = input.nextInt();

        System.out.println("This is a Java Pragram");
        System.out.printf("%s%n%s%n","This is a Java", "Proagram");

        if (number != 7)
            System.out.println("The variable number is not equal to 7");
    }
}