import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,
                n2,
                n3,
                n4,
                n5,
                negativos = 0,
                positivos = 0,
                zeros = 0
        ;

        System.out.println("Enter the first number");
        n1 = input.nextInt();

        if ( n1 < 0)
            negativos++;
        if ( n1 == 0)
            zeros++;
        if (n1 > 0)
            positivos++;

        System.out.println("Enter the second number");
        n2 = input.nextInt();

        if ( n2 < 0)
            negativos++;
        if ( n2 == 0)
            zeros++;
        if (n2 > 0)
            positivos++;
        System.out.println("Enter the third number");
        n3 = input.nextInt();

        if ( n3 < 0)
            negativos++;
        if ( n3 == 0)
            zeros++;
        if (n3 > 0)
            positivos++;
        System.out.println("Enter the fourth number");
        n4 = input.nextInt();

        if ( n4 < 0)
            negativos++;
        if ( n4 == 0)
            zeros++;
        if (n4 > 0)
            positivos++;
        System.out.println("Enter the fifith number");
        n5 = input.nextInt();

        if ( n5 < 0)
            negativos++;
        if ( n5 == 0)
            zeros++;
        if (n5 > 0)
            positivos++;

        System.out.printf("%d positivo(s), %d negativo(s), %d zero(s)", positivos, negativos, zeros);

    }
}