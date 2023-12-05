import java.util.Scanner;

public class Task1 {

    static String[] trainNames = {"Express", "SuperFast", "Local"};
    static int[] totalSeats = {50, 75, 100};
    static int[] availableSeats = {50, 75, 100};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Available Trains");
            System.out.println("2. Book Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableTrains();
                    break;
                case 2:
                    bookSeats();
                    break;
                case 3:
                    System.out.println("Exiting the train reservation system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void displayAvailableTrains() {
        System.out.println("Available Trains:");
        for (int i = 0; i < trainNames.length; i++) {
            System.out.println("Train Name: " + trainNames[i]);
            System.out.println("Total Seats: " + totalSeats[i]);
            System.out.println("Available Seats: " + availableSeats[i]);
            System.out.println("--------------");
        }
    }

    static void bookSeats() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the train number (1-" + trainNames.length + "): ");
        int trainNumber = scanner.nextInt();

        if (trainNumber < 1 || trainNumber > trainNames.length) {
            System.out.println("Invalid train number. Please try again.");
            return;
        }

        System.out.print("Enter the number of seats to book: ");
        int numSeats = scanner.nextInt();

        if (numSeats <= 0 || numSeats > availableSeats[trainNumber - 1]) {
            System.out.println("Invalid number of seats. Please check availability and try again.");
            return;
        }

        availableSeats[trainNumber - 1] -= numSeats;

        System.out.println("Seats booked successfully!");
    }
}
