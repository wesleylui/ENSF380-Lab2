
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to YYC Pet Resort Management System.");
			System.out.println("\n1. Manage Pet Profile.");
			System.out.println("2. Manage Care Instructions");
			System.out.println("3. Manage Client Profile");
			System.out.println("0. Exit");
			System.out.println("\nEnter a number to select your operation: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Exiting...");
				scanner.close();
				return;
			case 1:
				managePetProfile(scanner);
				break;
			case 2:
				manageCareInstructions(scanner);
				break;
			case 3:
				manageClientProfile(scanner);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}

		}

	}

	public static void managePetProfile(Scanner scanner) {
		while (true) {
			System.out.println("\nManage Pet Profile");
			System.out.println("1. Create Pet Profile");
			System.out.println("2. Update Pet Profile");
			System.out.println("0. Return to main menu");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 0:
				return; // return to main menu
			case 1:
				// TODO
				break;
			case 2:
				// TODO
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	public static void manageCareInstructions(Scanner scanner) {
		while (true) {
			System.out.println("\nManage Care Instructions");
			System.out.println("1. Assign Care Instructions to a Pet");
			System.out.println("2. Print Care Instructions");
			System.out.println("0. Return to main menu");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 0:
				return; // return to main menu
			case 1:
				// TODO
				break;
			case 2:
				// TODO
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	private static void manageClientProfile(Scanner scanner) {
		while (true) {
			System.out.println("\nManage Care Profile");
			System.out.println("1. Create Care Profile");
			System.out.println("2. Update Client Profile");
			System.out.println("0. Return to main menu");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 0:
				return; // return to main menu
			case 1:
				// TODO
				break;
			case 2:
				// TODO
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

}
