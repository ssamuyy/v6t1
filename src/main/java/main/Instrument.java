package main;

// Superclass Instrument: all used calsses are Instruments
public class Instrument {
    protected String manufacturer;
    protected int price;

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    //Common method for all Instruments
    public String getDetails() {
        return "Valmistaja: " + manufacturer + ", Hinta: " + price + "e";
    }
}