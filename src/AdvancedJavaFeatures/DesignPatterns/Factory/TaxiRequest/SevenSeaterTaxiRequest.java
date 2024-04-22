package AdvancedJavaFeatures.DesignPatterns.Factory.TaxiRequest;
public class SevenSeaterTaxiRequest extends  TaxiRequest<String> {
    private static final double FARE_MULTIPLIER = 2;


    public SevenSeaterTaxiRequest(final String pickUpLocation, final String destination, final double distance) {
        super(pickUpLocation, destination, distance);
    }

    @Override
    public void createTaxiRequest(final String pickUpLocation, final String destination, final double distance) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.distance = distance;
        this.estimatedPrice = distance * FARE_MULTIPLIER;

        System.out.println("A Large taxi is on its way. The estimated fare is Ghc" + estimatedPrice + ".");

    }
}
