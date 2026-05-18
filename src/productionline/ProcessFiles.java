package productionline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProcessFiles {

    public void WriteFile(ArrayList<Product> products) {

        try {
            FileWriter writer = new FileWriter("TestResults.txt", true);

            for (Product p : products) {
                writer.write(p.toString() + "\n");
                writer.write("-------------------\n");
            }
                writer.write("-------------------\n");
            

            writer.close();
            System.out.println("Data berhasil disimpan ke file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}