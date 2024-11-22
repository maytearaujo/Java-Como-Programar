import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double weight,
                height,
                IMC;

        System.out.print("Enter the weight: ");
        weight = input.nextDouble();

        System.out.print("Enter the height: ");
        height = input.nextDouble();

        IMC = weight / (height * height);

        if (IMC < 18.5)
            System.out.println("Underweight");
        if (IMC > 18.5 && IMC < 24.9)
            System.out.println("Normal");
        if (IMC > 25 && IMC < 29.9)
            System.out.println("Overweight");
        if (IMC >= 30)
            System.out.println("Obese");
    }
}