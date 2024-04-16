package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        int choice = 0;

        try {
            do {
                System.out.println("""
                        Choose a drink:
                        1 - Espresso
                        2 - Cappuccino
                        3 - Latte
                        0 - Exit""");

                choice = input.nextInt();

            } while (choice < 0 || choice > 3);
        } catch (InputMismatchException exception) {
            System.out.println("Please, input integer value next time!");
        }

        CoffeeCreator.coffeeCreate(choice);
    }
}
