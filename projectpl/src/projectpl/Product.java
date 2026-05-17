package projectpl;
import java.util.Date;

public abstract class Product {

    private static int currentProductionNumber = 1;

    private int serialNumber;
    private String manufacturer = "No Bug Inc.";
    private Date manufacturedOn;
    private String name;

    public Product(String name) {

        this.name = name;
        this.serialNumber = currentProductionNumber++;
        this.manufacturedOn = new Date();
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Date getManufacturedOn() {
        return manufacturedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {

        return "Manufacturer : " + manufacturer +
                "\nSerial Number : " + serialNumber +
                "\nDate : " + manufacturedOn +
                "\nName : " + name;
    }
}