public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
    @Override
    public void addExtraCheese(){}
    public void addExtraTopping(){};
}
