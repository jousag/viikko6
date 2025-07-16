package soittimet;

public class StringInstrument extends Instrument {
    private int numberOfStrings;

    public StringInstrument(String manufacturer, String price, int numberOfStrings) {
        super(manufacturer, price);
        this.numberOfStrings = numberOfStrings;
    }

    public void tune() {
        System.out.println(getManufacturer() + " soittimesta viritetään " + numberOfStrings + " kieltä.");
    }
}

