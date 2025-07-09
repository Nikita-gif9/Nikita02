package permitcategoryrefactor_nikitasharma;

import java.util.Scanner;

/**
 * Main class to run the permit system.
 */
public class PermitCategoryRefactor_NIKITASHARMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String permitNumber;

        while (true) {
            System.out.print("Enter your permit number (format: P1234): ");
            permitNumber = scanner.nextLine().trim();

            if (permitNumber.matches("P\\d{4}")) {
                break;
            } else {
                System.out.println("Invalid format. Permit number must start with 'P' followed by 4 digits.");
            }
        }

        System.out.println("\nSelect a category:");
        PermitCategory[] categories = PermitCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        int choice = 0;
        while (true) {
            System.out.print("Enter choice number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= categories.length) {
                    break;
                } else {
                    System.out.println("Invalid option. Choose a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        Permit permit = new Permit(permitNumber, categories[choice - 1]);
        System.out.println();
        permit.displayPermit();

        scanner.close();
    }
}
