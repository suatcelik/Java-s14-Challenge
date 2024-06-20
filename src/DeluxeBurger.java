public class DeluxeBurger extends Hamburger{
    private boolean cips;
    private boolean drink;

    public DeluxeBurger() {
        super(35.7, "Deluxe Burger", "Beef", "Double Sandwich");
        this.cips = true;
        this.drink = true;
    }


    @Override
    public void addHamburgerAddition1(String additionName, int additionPrice) {
        System.out.println("");
    }

    @Override
    public void addHamburgerAddition2(String additionName, int additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String additionName, int additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String additionName, int additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}