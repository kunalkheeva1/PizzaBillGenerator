public class Main {
    public static void main(String[] args) {

    Pizza pizza = new Pizza(true);
    pizza.addExtraCheese();
    pizza.addExtraTopping();
    pizza.addExtraTopping();
    pizza.toGo();
        System.out.println(pizza.getBill());

    }
}