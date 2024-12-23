package LabExer22;

import java.util.Scanner;

public class LabExer22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String itemName;
        double itemPrice;
        int itemQuantity;

        System.out.println("Enter the name of the item you are purchasing: ");
        itemName = input.nextLine();

        System.out.println("Enter Quantity: ");
        itemQuantity = input.nextInt();

        System.out.println("Enter Price: ");
        itemPrice = input.nextDouble();

        double totalAmount = itemPrice * itemQuantity;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Price: " + itemPrice);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("----------------");

        // Correct floor value computation
        System.out.println("Floor Value: " + Math.floor(totalAmount));
        System.out.println("Ceiling Value: " + Math.ceil(totalAmount));
        System.out.println("Rounded Value: " + Math.round(totalAmount));
        System.out.println("----------------");

        input.close();
    }
}
