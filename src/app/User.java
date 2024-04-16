package app;

public class User {

    private Coffee coffee;

    public void chooseCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void getADrink() {
        coffee.makeCoffee();
    }
}
