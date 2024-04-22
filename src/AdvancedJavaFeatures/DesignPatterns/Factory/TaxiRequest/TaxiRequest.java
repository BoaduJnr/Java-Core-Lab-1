package AdvancedJavaFeatures.DesignPatterns.Factory.TaxiRequest;

public abstract class TaxiRequest<T> {
    //Pick up location could a an Address(String) or fast food joint (Restaurant)
    protected T pickUpLocation;
    protected String destination;
    protected double distance;
    protected double estimatedPrice;
    public  TaxiRequest(T pickUpLocation, String destination, double distance){
        createTaxiRequest(pickUpLocation, destination, distance);
    }

      public abstract  void createTaxiRequest(T pickUpLocation, String destination, double distance);

}
