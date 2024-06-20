public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(70, "hamburger", "dana", "yuvarlak");
        hamburger.addHamburgerAddition1("peynir", 20);
        System.out.println(hamburger);
    }
}