package projectpl;
import java.util.ArrayList;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

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
    
    //step 17 bonus, print berdasarkan tipe
    public static void printType(ArrayList<Product> list, Class<?> type) {
        for (Product p : list) {
            if (p.getClass() == type) {
                System.out.println(p);
                System.out.println("-------------------");
            }
        }
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

    public Date getManufactureDate() { 
    	return manufacturedOn; 
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.getName());
    }
    
    @Override
    public String toString() {

        return "Manufacturer : " + manufacturer +
                "\nSerial Number : " + serialNumber +
                "\nDate : " + manufacturedOn +
                "\nName : " + name;
    }
}