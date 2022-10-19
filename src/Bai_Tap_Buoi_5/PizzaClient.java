package Bai_Tap_Buoi_5;

public class PizzaClient {
    public void run() {
        Pizza circle1 = new Pizza(5, new Circle(3));
        Pizza rectangle1 = new Pizza(6.5, new Rectangle(4, 6));
        PizzaDeal gia1 = new PizzaDeal();
        System.out.println(circle1 + " Co Gia Tot Hon " + rectangle1 + ": " + gia1.betterDeal(circle1, rectangle1));
    }
    public static void main(String[] args) {
        new PizzaClient().run();
    }
}

