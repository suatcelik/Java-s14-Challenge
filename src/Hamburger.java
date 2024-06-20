public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(double price, String name, String meat, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String name, int price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, int price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, int price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, int price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {

        double[] prices = {price, addition1Price, addition2Price, addition3Price, addition4Price};
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        this.setPrice(totalPrice);
        System.out.println(this);
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", breadRollType='" + breadRollType + '\'' +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition2Price=" + addition2Price +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition3Price=" + addition3Price +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition4Price=" + addition4Price +
                '}';
    }
}