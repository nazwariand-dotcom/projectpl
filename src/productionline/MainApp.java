package productionline;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        ArrayList<Product> products = new ArrayList<>();

        while (running) {
            
            System.out.println("\n=== DATA PRODUCT ===");
            System.out.println("1. Tambah Audio Player");
            System.out.println("2. Tambah Movie Player");
            System.out.println("3. Lihat Semua Product");
            System.out.println("4. Statistik Product");
            System.out.println("5. Simpan ke file");
            System.out.println("6. Lihat file");
            System.out.println("7. Exit");
            System.out.print("Pilih: ");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    AudioPlayer audio = new AudioPlayer("Sony Speaker", "Dolby");
                    products.add(audio);
                    System.out.println("Audio Player ditambahkan");
                    break;


                case 2:
                    Screen screen = new Screen("1920x1080", 60, 10);
                    MoviePlayer movie = new MoviePlayer("Samsung Movie", screen, MonitorType.LED);
                    products.add(movie);
                    System.out.println("Movie Player ditambahkan");
                    break;
                case 3:
                System.out.println("\n=== DATA PRODUCT ===");

                if (products.isEmpty()) {
                    System.out.println("Belum ada produk");
                } else {
                    System.out.println("Total: " + products.size());

                    for (Product p : products) {
                        System.out.println("-------------------");
                        System.out.println(p);
                    }
                }
                System.out.println(); 
                break;

                    
                case 4:
                    System.out.println("\n=== STATISTIK PRODUCT ===");

                    int total = products.size();
                    System.out.println("Total Product: " + total);

                    long audioCount = products.stream().filter(p -> p instanceof AudioPlayer).count();
                    long movieCount = products.stream().filter(p -> p instanceof MoviePlayer).count();

                    System.out.println("Audio Player: " + audioCount);
                    System.out.println("Movie Player: " + movieCount);

                    break;

                case 5:
                    ProcessFiles pf = new ProcessFiles();
                    pf.WriteFile(products);
                    break;

                case 6:
                    ViewFileInfo vf = new ViewFileInfo();
                    vf.readFile();
                    break;

                case 7:
                    running = false;
                    System.out.println("Keluar program...");
                    
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

        input.close();
        return;
    }
}