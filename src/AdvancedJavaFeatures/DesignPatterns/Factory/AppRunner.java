package AdvancedJavaFeatures.DesignPatterns.Factory;

public class AppRunner {

    public static void main(String[] args) {
        System.out.print("Standard taxi (default) - ");
        TaxiRequestCreator.getTaxiRequest("1 Charming Av", "49 GoodFeeling Ln", 5);

        System.out.print("Food Delivery (Restaurant) - ");
        TaxiRequestCreator.getTaxiRequest(Restaurant.STARBITE,"49 GoodFeeling Ln", 5);

        System.out.print("Seven seater (passengers) - ");
        TaxiRequestCreator.getTaxiRequest(6, "4 Jungle Ave", "49 GoodFeeling Ln", 5);

        System.out.print("Mini bus (TaxiType) - ");
        TaxiRequestCreator.getTaxiRequest(TaxiType.MINI_BUS, "113 Lagos Street", "4 Jungle Ave", 5);

        System.out.print("Error - ");
        TaxiRequestCreator.getTaxiRequest(345, "1 Charming Av", "49 GoodFeeling Ln", 5);
    }
}
