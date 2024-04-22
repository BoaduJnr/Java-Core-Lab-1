package AdvancedJavaFeatures.DesignPatterns.Factory.TaxiRequest;

import AdvancedJavaFeatures.DesignPatterns.Factory.Restaurant;

public class FoodDeliveryRequest extends  TaxiRequest<Restaurant>{
    private static final double FARE_MULTIPLIER = 0.5;


    public FoodDeliveryRequest(Restaurant pickUpLocation, String destination, double distance) {
        super(pickUpLocation, destination, distance);
    }

    @Override
    public void createTaxiRequest(Restaurant pickUpLocation, String destination, double distance) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.distance = distance;
        double foodBill = pickUpLocation.getPrice();
        this.estimatedPrice = distance * FARE_MULTIPLIER + foodBill;

        System.out.println("Your food from "
                + this.pickUpLocation.toString().toLowerCase()
                + " is on its way! The total bill (including delivery) is Ghc"
                + this.estimatedPrice
                + ".");
    }

}
