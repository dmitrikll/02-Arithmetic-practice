package task01;

import java.util.Locale;

public class Main {
    static String fruitName;
    static String fruitDimension;
    static double fruitPrice;
    static double fruitSold;
    static double totalCost;

    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {
        fruitName = "Orange";
        fruitDimension = "kg";
        fruitPrice = 2.5899;
        fruitSold = 59.329;
        totalCost = fruitPrice * fruitSold;

        String fruitSoldPrint = String.format(Locale.CANADA_FRENCH, "%.3f", fruitSold);
        String totalCostPrint = String.format(Locale.CANADA_FRENCH, "%.2f", totalCost);

        System.out.println(fruitName + ", sold " + fruitSoldPrint + " " + fruitDimension + ", total cost is " + CURRENCY + " " + totalCostPrint + "\n");
    }
}
