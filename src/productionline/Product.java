package productionline;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Step 3 - Abstract Product class
 * Implements Item interface and provides base functionality for all production line items.
 */
public abstract class Product implements Item, Comparable<Product> {

    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

    private static int currentProductionNumber = 1;

    public Product(String name) {
        this.manufacturer = Item.manufacturer;
        this.name = name;
        this.serialNumber = currentProductionNumber;
        currentProductionNumber++;
        this.manufacturedOn = new Date();
    }

    // Item interface implementations
    @Override
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // Step 14 - Comparable for Collections.sort by name
    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    // Step 16 - Static print method that prints all items in collection
    public static void print(Collection<? extends Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Step 17 - Static printType method - prints all items of a specific type
    public static void printType(Collection<? extends Product> products, Class<?> type) {
        for (Product p : products) {
            if (type.isInstance(p)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Manufacturer  : " + manufacturer + "\n"
             + "Serial Number : " + serialNumber + "\n"
             + "Date          : " + manufacturedOn + "\n"
             + "Name          : " + name;
    }
}
