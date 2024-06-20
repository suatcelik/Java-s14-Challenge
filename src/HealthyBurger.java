public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(double price, String name, String meat, String breadRollType) {
        super(price, name, meat, breadRollType);
    }

    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;

    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
    }

    @Override
    public double itemizeHamburger() {
        double[] prices = {super.getPrice(), super.getAddition1Price(), super.getAddition2Price(), super.getAddition3Price(), super.getAddition4Price(), healthyExtra1Price, healthyExtra2Price};
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        super.setPrice(totalPrice);
        System.out.println(this);
        return totalPrice;
    }

    @Override
    public String toString() {
        return "HealthyBurger{" +
                "healthyExtra1Name='" + healthyExtra1Name + '\'' +
                ", healthyExtra1Price=" + healthyExtra1Price +
                ", healthyExtra2Name='" + healthyExtra2Name + '\'' +
                ", healthyExtra2Price=" + healthyExtra2Price +
                '}';
    }
}