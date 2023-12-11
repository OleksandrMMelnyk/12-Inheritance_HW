package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {
    private final Scanner rateScanner = new Scanner(System.in);

    public double getData() {
        System.out.print("Enter the number: ");
        rateScanner.useLocale(Locale.ENGLISH);
        return rateScanner.nextDouble();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
