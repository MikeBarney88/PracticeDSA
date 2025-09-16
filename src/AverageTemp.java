import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user for number of days (minimum 5)
        int numDays = 0; // Initialize to 0 to enter the loop
        while (numDays < 5) {
            System.out.print("Enter the number of days (minimum 5): ");
            numDays = scanner.nextInt();
            if (numDays < 5) {
                System.out.println("Error: Please enter at least 5 days.");
            }
        }

        // Create array to store temperatures
        double[] temperatures = new double[numDays];

        // Prompt user to enter all temperature values
        System.out.println("Enter the temperature values:");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate the average temperature
        double sum = 0;
        for (int i = 0; i < numDays; i++) {
            sum += temperatures[i];
        }
        double averageTemperature = sum / numDays;

        // Count how many temperatures are above average
        int daysAboveAverage = 0;
        for (int i = 0; i < numDays; i++) {
            if (temperatures[i] > averageTemperature) {
                daysAboveAverage++;
            }
        }

        // Display
        System.out.println("\nResults");
        System.out.printf("Average temperature: %.2f\n", averageTemperature);
        System.out.println("Number of days above average: " + daysAboveAverage);

        scanner.close();
    }
}
