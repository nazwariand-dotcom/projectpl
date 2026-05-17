package projectpl;

import java.util.Date;

public interface Item {
	String manufacturer = "No Bug Inc.";
	
	
	void setProductionNumber(int productionNumber);
	void setName(String setName);
	String getName();
	Date getManufactureDate();
	int getSerialNumber();
}
