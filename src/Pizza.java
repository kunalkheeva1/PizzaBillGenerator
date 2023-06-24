public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice= 2;
    private double extraToppingPrice = 1.5;
    private double extraBagPrice = .20;
    private int basePizzaPrice =0;

    //confirmations for the final bill
    private boolean isCheeseAdded = false;
    private int noOfToppingsAdded =0;
    private boolean isToGo =false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 15;
        }
        else {
            this.price = 20;
        }
        basePizzaPrice = this.price;
    }

    //add extra cheese method
    public void addExtraCheese(){
        isCheeseAdded = true;
        this.price +=extraCheesePrice;
    }
    //add extra topping method
    public void addExtraTopping(){
        noOfToppingsAdded +=1;
        this.price += extraToppingPrice;
    }
    // take out or not? if take out then add the bag price in total
    public void toGo(){
        isToGo = true;
        this.price +=extraBagPrice;
    }
    // get total bill
    public void getBill(){
        System.out.println("Base Price of Pizza: " + basePizzaPrice);
        if(isCheeseAdded){
            System.out.println("Extra Cheese Added" + extraCheesePrice);
        }
        if(noOfToppingsAdded >0){
            System.out.println( noOfToppingsAdded + "Number of Toppings added, Price addition = " + noOfToppingsAdded*extraToppingPrice);
        }
        if(isToGo) {
            System.out.println("Price of Extra Bag: " + extraBagPrice);
        }
        System.out.println("Your total is: " + this.price);
    }
}
