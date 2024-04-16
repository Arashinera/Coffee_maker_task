package app;

public class CoffeeCreator {

    static User user = new User();

    public static void coffeeCreate(int choice) {
        switch (choice) {
            case 1:
                user.chooseCoffee(new Espresso());
                user.getADrink();
                break;
            case 2:
                user.chooseCoffee(new Cappuccino());
                user.getADrink();
                break;
            case 3:
                user.chooseCoffee(new Latte());
                user.getADrink();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
