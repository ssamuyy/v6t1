package main;

// Drum subclass of Instrument inherits from Instrument
public class Drum extends Instrument {
    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
    }

    // Unique method for only drums
    public void playBeat() {
        System.out.println(manufacturer + " rummut soittavat komppia!");
    }
}