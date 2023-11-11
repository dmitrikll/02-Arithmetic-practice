package task02;

import java.util.Locale;

public class Main {
    static double morningTemperature;
    static double noonTemperature;
    static double eveningTemperature;
    static double averageDayTemperature;

    public static void main(String[] args) {
        morningTemperature = 14.5;
        noonTemperature = 21.3;
        eveningTemperature = 17.6;
        averageDayTemperature = (morningTemperature + noonTemperature + eveningTemperature) / 3;

        System.out.println("1) morning temperature is " + String.format(Locale.ENGLISH, "%.1f", morningTemperature) + " degree(s).\n" +
                "2) noon temperature is " + String.format(Locale.ENGLISH, "%.1f", noonTemperature) + " degree(s).\n" +
                "3) evening temperature is " + String.format(Locale.ENGLISH, "%.1f", eveningTemperature) + " degree(s).\n" +
                "Average day temperature is " + String.format(Locale.CANADA_FRENCH, "%.1f", averageDayTemperature) + " degree(s).\n");
    }
}
