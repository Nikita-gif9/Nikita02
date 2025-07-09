/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit_category;
import java.util.Scanner;
/**
 *
 * @author sapna
 */
public class Permit_Category {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String permitNumber = getValidPermitNumber(scanner);
        PermitCategory selectedCategory = selectPermitCategory(scanner);
        Permit permit = new Permit(permitNumber, selectedCategory);
        permit.display();
        scanner.close();
    }

    // Validates the permit number format
    private static String getValidPermitNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter your permit number (format: P1234): ");
            String input = scanner.nextLine().trim();
            if (input.matches("P\\d{4}")) {
                return input;
            } else {
                System.out.println("Invalid format. Permit number must start with 'P' followed by 4 digits.");
            }
        }
    }

    // Displays and handles category selection
    private static PermitCategory selectPermitCategory(Scanner scanner) {
        System.out.println("\nSelect a permit category:");
        PermitCategory[] categories = PermitCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        while (true) {
            System.out.print("Enter the category number: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= categories.length) {
                    return categories[choice - 1];
                } else {
                    System.out.println("Invalid option. Choose from the list.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }
}
