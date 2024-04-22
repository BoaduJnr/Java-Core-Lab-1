package AdvancedJavaFeatures.DesignPatterns.Factory;

public enum Restaurant {
    MCDONALD(5.30),
    KFC(4.99),
    BURGER_KING(8.20),
    DOMINOS(10.99),
    STARBITE(6.33),
    CHICKENMAN_PIZZAMAN(4.59),
    PICE(2.99);

    private final double price;

    Restaurant(double price) {
        this.price = price;
    }

    // Getter
    public double getPrice() {
        return price;
    }
}