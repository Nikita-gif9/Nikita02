package permitcategoryrefactor_nikitasharma;

/**
 * Permit class that stores permit number and category.
 */
public class Permit {
    private String permitNumber;
    private PermitCategory category;

    public Permit(String permitNumber, PermitCategory category) {
        this.permitNumber = permitNumber;
        this.category = category;
    }

    public void displayPermit() {
        System.out.println("Permit created successfully!");
        System.out.println("Permit Number: " + permitNumber);
        System.out.println("Permit Category: " + category);
    }
}
