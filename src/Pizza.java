public class Pizza {
    private int price;
    private boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
    }

//    public void getPizzaPizza(){
//        System.out.println(this.price);
//    }
}
