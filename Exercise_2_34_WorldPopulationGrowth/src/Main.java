import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currentPopulation = 8200000000.0,
                growthRate = 0.012,
                populationFuture = 0
        ;

/*        System.out.print("Enter the current world population: ");
        currentPopulation = input.nextDouble();

        System.out.print("Enter the current world population growth rate: ");
        growthRate = input.nextDouble();*/

//        populationFuture = currentPopulation * (1 + growthRate);
        System.out.printf("População Mundial Estimada em 2025: %.2f%n",
                populationFuture = currentPopulation * (1 + growthRate));
        currentPopulation = populationFuture;


        System.out.printf("População Mundial Estimada em 2026: %.2f%n",
                populationFuture = currentPopulation * (1 + growthRate));
        currentPopulation = populationFuture;


        System.out.printf("População Mundial Estimada em 2027: %.2f%n",
                populationFuture = currentPopulation * (1 + growthRate));
        currentPopulation = populationFuture;


        System.out.printf("População Mundial Estimada em 2028: %.2f%n",
                populationFuture = currentPopulation * (1 + growthRate));
        currentPopulation = populationFuture;


        System.out.printf("População Mundial Estimada em 2029: %.2f%n",
                populationFuture = currentPopulation * (1 + growthRate));
        currentPopulation = populationFuture;

    }
}