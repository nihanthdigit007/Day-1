import java.util.Scanner;
import java.util.Random;

public class Assignment4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Enter the number of times to flip the coin:");
            int flips = scanner.nextInt();

            if (flips <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int headsCount = 0;
            int tailsCount = 0;

            for (int i = 0; i < flips; i++) {
                if (random.nextDouble() < 0.5) {
                    tailsCount++;
                } else {
                    headsCount++;
                }
            }

            double headsPercentage = ((double) headsCount / flips) * 100;
            double tailsPercentage = ((double) tailsCount / flips) * 100;

            System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
            System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");

        }
    }

