package main;

// Guitar subclass of StringInstrument inherits from StringInstrument
public class Guitar extends StringInstrument {
    public Guitar(String manufacturer, int price) {
        super(manufacturer, price, 6);
    }
}