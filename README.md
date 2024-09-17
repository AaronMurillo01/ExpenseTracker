
# Expense Tracker

## Project Overview
The Expense Tracker is a simple console-based Java application that allows users to track their expenses, categorize them, and view a summary of their spending. Users can add expenses with a description, view all recorded expenses, filter them by category, and see the total amount spent.

## Features
- **Add Expense**: Record an expense with a category and description.
- **View All Expenses**: Display all recorded expenses.
- **Filter by Category**: View expenses filtered by a specific category.
- **View Total Spent**: See the total amount spent based on recorded expenses.

## Folder Structure
```
ExpenseTracker/
│
├── src/
│   ├── Expense.java              # Class to represent an expense
│   ├── ExpenseTracker.java       # Class to manage expenses and track spending
│   └── Main.java                 # Main class to run the expense tracker system
└── .vscode/                      # Optional (for debugging in VSCode)
    └── launch.json               # Optional (VSCode debugging config)
```

## Prerequisites
Before running the application, ensure you have the following installed:
1. **Java Development Kit (JDK)**: Download and install JDK (version 17 or later recommended). You can check if it's installed using:
   ```bash
   java -version
   ```

2. **Text Editor or IDE**: You can use any text editor or IDE. We recommend using [Visual Studio Code](https://code.visualstudio.com/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## How to Run
1. Clone or download the project files to your local machine.
2. Open a terminal in the `ExpenseTracker/` directory.
3. Navigate to the `src/` folder:
   ```bash
   cd src
   ```
4. Compile the Java files:
   ```bash
   javac Expense.java ExpenseTracker.java Main.java
   ```
5. Run the application:
   ```bash
   java Main
   ```

## Future Enhancements
- **Expense Editing**: Allow users to edit or delete previously recorded expenses.
- **Persistence**: Save expenses to a file or database for data persistence.
- **Graphical User Interface (GUI)**: Build a GUI using JavaFX or Swing for a more user-friendly interface.

