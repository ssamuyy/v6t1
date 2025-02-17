package main;

//StringInsturment subclass of Instrument inherits from Instrument, but is a superclass for string instruments
public class StringInstrument extends Instrument {
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    // Common method of all StringInstruments (Guitar and Violin)
    public void tune() {
        System.out.println(manufacturer + " soittimesta viritettiin " + numberOfStrings + " kieltä!");
    }
}