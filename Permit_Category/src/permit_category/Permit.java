/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permit_category;

/**
 *
 * @author sapna
 */
public class Permit {
    private String permitNumber;
    private PermitCategory category;

    public Permit(String permitNumber, PermitCategory category) {
        this.permitNumber = permitNumber;
        this.category = category;
    }

    public void display() {
        System.out.println("Permit created successfully!");
        System.out.println("Permit Number: " + permitNumber);
        System.out.println("Permit Category: " + category);
    }
}
