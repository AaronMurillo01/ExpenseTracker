// src/Main.java
import java.util.Scanner;

public class Main {
    private static ExpenseTracker tracker = new ExpenseTracker();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the Expense Tracker!");

        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    viewExpensesByCategory();
                    break;
                case 4:
                    viewTotalSpent();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nExpense Tracker Menu:");
        System.out.println("1. Add an expense");
        System.out.println("2. View all expenses");
        System.out.println("3. View expenses by category");
        System.out.println("4. View total spent");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addExpense() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter category (e.g., Food, Travel, Bills): ");
        String category = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        tracker.addExpense(amount, category, description);
    }

    private static void viewAllExpenses() {
        tracker.viewAllExpenses();
    }

    private static void viewExpensesByCategory() {
        System.out.print("Enter category to filter by: ");
        String category = scanner.nextLine();
        tracker.viewExpensesByCategory(category);
    }

    private static void viewTotalSpent() {
        tracker.viewTotalSpent();
    }
}
