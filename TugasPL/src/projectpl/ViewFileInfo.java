package projectpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViewFileInfo {
    public void readFile() {
    try {
        System.out.println("\n=== DATA DARI FILE ==="); 

        BufferedReader reader = new BufferedReader(new FileReader("TestResults.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        System.out.println();

    } catch (IOException e) {
        System.out.println("File tidak ditemukan.");
    }
} }