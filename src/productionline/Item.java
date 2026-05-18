package productionline;

import java.util.Date;

/**
 * Step 1 - Item interface
 * Forces all classes to implement the following functions.
 */
public interface Item {
    String manufacturer = "OracleProduction";

    void setProductionNumber(int productionNumber);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();
}
