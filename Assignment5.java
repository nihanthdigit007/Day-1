import java.util.Scanner;

public class Assignment5 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a 4-digit year:");
            int year = scanner.nextInt();

            if (year < 1000 || year > 9999) {
                System.out.println("Please enter a valid 4-digit year.");
                return;
            }

            boolean isLeapYear = false;

            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

