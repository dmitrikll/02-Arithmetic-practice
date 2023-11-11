package task03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final String CURRENCY = "USD";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Input product name: ");
        String productName = scanner.nextLine();

        System.out.print("Input product quantity, pcs.: ");
        int productQuantity = scanner.nextInt();

        System.out.print("Input product price, " + CURRENCY + ": ");
        double productPrice = scanner.nextDouble();

        scanner.nextLine();
        double costProduct = productQuantity * productPrice;

        System.out.println("Cost of " + productName + " is " + CURRENCY + " " + String.format(Locale.CANADA_FRENCH, "%.2f", costProduct) + ".");

        scanner.close();
    }
}