package soittimet;

public class Instrument {
    private String manufacturer;
    private String price;

    public Instrument(String manufacturer, String price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getDetails() {
        return "Valmistaja: " + manufacturer + ", Hinta: " + price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
