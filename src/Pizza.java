public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice= 2;
    private double extraToppingPrice = 1.5;
    private double extraBagPrice = .20;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 15;
        }
        else {
            this.price = 20;
        }
    }

    //add extra cheese method
    public void addExtraCheese(){
        System.out.println("Extra Cheese Added");
        this.price +=extraCheesePrice;
    }
    //add extra topping method
    public void addExtraTopping(){
        System.out.println("Extra Topping Added");
        this.price += extraToppingPrice;
    }
    // take out or not? if take out then add the bag price in total
    public void toGo(){
        System.out.println("ToGo is opted");
        this.price +=extraBagPrice;
    }
    // get total bill
    public int getBill(){
       return this.price;
    }
}
