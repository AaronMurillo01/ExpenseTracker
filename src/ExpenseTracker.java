// src/ExpenseTracker.java
import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(double amount, String category, String description) {
        Expense expense = new Expense(amount, category, description);
        expenses.add(expense);
        System.out.println("Added: " + expense);
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.println("\nAll Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public void viewExpensesByCategory(String category) {
        boolean found = false;
        System.out.println("\nExpenses in category: " + category);
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No expenses found for this category.");
        }
    }

    public void viewTotalSpent() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        System.out.println("\nTotal spent: $" + total);
    }
}
