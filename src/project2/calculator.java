package project2;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			char operator;
			double number1, number2, result;

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
			System.out.println("| + Addition | - Subtraction | * Multiplication | / Division                     |");
			System.out.println("==================================================================================\n");
			
			System.out.print("Select an operator or type stop: ");
			String option = input.nextLine();
			if (option.equalsIgnoreCase("stop") ) {
				break;
			}
			
			operator = option.charAt(0);
			System.out.print("Input a number: ");
			number1 = input.nextDouble();
			System.out.print("Input another number: ");
			number2 = input.nextDouble();
			input.nextLine();
			
			switch (operator) {
			case '+':
				result = number1 + number2;
				System.out.println("Total is: " + number1 + " + " + number2 + " = " + result + "\n");
				break;
			case '-':
				result = number1 - number2;
				System.out.println("Total is: " + number1 + " - " + number2 + " = " + result + "\n");
				break;
			case '*':
				result = number1 * number2;
				System.out.println("Total is: " + number1 + " * " + number2 + " = " + result + "\n");
				break;
			case '/':
				result = number1 / number2;
				System.out.println("Total is: " + number1 + " / " + number2 + " = " + result + "\n");
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
		System.out.println("Program has ended.");
		input.close();
	}
}

// Notes:
//-> while loop * done
//-> able to 'stop' * done
//-> push 1 (empty file) * done
//-> basic project (push 2) * done
//-> print summation * done
//(ask for operator > ask for number > ask for another number) * done
//-> basic project + extra number input (push 3)
//-> basic project + extra module input (push 4)
//-> gui graphic module (branch 1)
//-> clear calculation or continue - (extra after turn in)

//Skapa ett javaprojekt enligt nedanstående kravspecifikation och gör minst
//fyra push till repot. En per feature. Skapa en ny branch för respektive
//feature. Ta inte bort brancher, du ska vid redovisningen kunna visa att du
//arbetat enligt instruktionerna
//
//
//
//Kravspecifikation: Wigellkoncernen vill att du ska bygga en enkel kalkylator.
//G Kalkylatorn ska ha funktionalitet för de fyra räknesätten + - * /Användaren
//ska nå funktionaliteten för valt räknesätt genom en huvudmeny som byggs av en
//switch-sats.Programmet ska köras kontinuerligt tills användaren väljer att
//avsluta via ett val i menyn.Kalkylatorn behöver endast ha funktionalitet för
//att hantera två tal i respektive beräkning
//
//Input och output sker via konsolen, användargränssnittet är
//tillfredsställande
//
//Tomas Wigell ska bjudas in till projektet som collaboratorInlämning sker via
//länk till githubrepo Mindre kompletteringar får förekomma
//
//VG Samtliga krav för G är uppfyllda Kalkylatorn kan hantera fler än 2 tal i
//respektive beräkningFunktionalitet för operatorn % (modulus) ska
//finnasAnvändargränssnittet visar på djup förståelse av den aspekten Uppgiften
//ska vara inlämnad innan deadlineMindre kompletteringar får förekomma
