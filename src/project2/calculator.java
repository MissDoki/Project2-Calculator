package project2;

import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ================================================================================");
		System.out.println("|  WELCOME TO MATH CALCULATOR 1.0                                                |");
		System.out.println("|                                                                                |");
		System.out.println("|  You can use this program to calculate different types of basic                |");
		System.out.println("|  calculations trough the menu.                                                 |");
		System.out.println("|                                                                                |");
		System.out.println("|  Use the input in the menu to run the program.                                 |");
		System.out.println("|  To stop the program just input 'stop' in the console..                        |");
		System.out.println("==================================================================================");
		System.out.println("==================================================================================");
		System.out.println("| Different type of operators you can use are:                                   |");
		System.out.println("|                                                                                |");
		System.out.println("| + Addition | - Subtraction | * Multiplication | / Division | % Division rest   |");
		System.out.println("==================================================================================\n");
		while (true) {
			char operator;
			double number, result;
			boolean wrongInput = false;
			System.out.print("Select an operator or type stop: ");
			String option = input.nextLine();
			if (option.equalsIgnoreCase("stop")) {
				break;
			}
			try {
				operator = option.charAt(0);
			} catch (Exception e) {
				continue;
			}
			switch (operator) {
			case '+':
			case '-':
			case '/':
			case '*':
			case '%':
				break;
			default:
				System.out.println("\nInvalid input.\n" + "Enter a valid operator or 'stop' to close.\n"
						+ "Operators to use are ( +, -, *, /, % )\n");
				continue;
			}
			ArrayList<Double> numbers = new ArrayList<Double>();
			for (int i = 0; i < 99;) {
				wrongInput = true;
				while (wrongInput) {
					System.out.println("Input number or 'calc' for calculation: ");
					try {
						String userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("calc")) {
							if (numbers.size() >= 2) {
								i = 100;
								break;
							}
						}
						number = Double.parseDouble(userInput);
						numbers.add(number);
					} catch (Exception e) {
						System.out.println("Invalid input. Input a valid number.\n");
					}
				}
			}
			switch (operator) {
			case '+':
				result = numbers.get(0);
				System.out.print("Total is: " + result);

				for (int i = 1; i < numbers.size(); i++) {
					result += numbers.get(i);
					System.out.print(" + " + numbers.get(i));
				}
				System.out.println(" = " + result + "\n");
				break;
			case '-':
				result = numbers.get(0);
				System.out.print("Total is: " + result);

				for (int i = 1; i < numbers.size(); i++) {
					result -= numbers.get(i);
					System.out.print(" - " + numbers.get(i));
				}
				System.out.println(" = " + result + "\n");
				break;
			case '*':
				result = numbers.get(0);
				System.out.print("Total is: " + result);

				for (int i = 1; i < numbers.size(); i++) {
					result *= numbers.get(i);
					System.out.print(" * " + numbers.get(i));
				}
				System.out.println(" = " + result + "\n");
				break;
			case '/':
				result = numbers.get(0);
				System.out.print("Total is: " + result);

				for (int i = 1; i < numbers.size(); i++) {
					result /= numbers.get(i);
					System.out.print(" / " + numbers.get(i));
				}
				System.out.println(" = " + result + "\n");
				break;
			case '%':
				result = numbers.get(0);
				System.out.print("Total is: " + result);

				for (int i = 1; i < numbers.size(); i++) {
					result %= numbers.get(i);
					System.out.print(" % " + numbers.get(i));
				}
				System.out.println(" = " + result + "\n");
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
		System.out.println("Program has ended.");
		input.close();
	}
}
