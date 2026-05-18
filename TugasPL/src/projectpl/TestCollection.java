package projectpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestCollection {
	public static void print(ArrayList<Product> list) {
		System.out.println("===== DAFTAR PRODUK =====");
		for (Product p : list) {
			System.out.println(p);
			System.out.println("-------------------");
		}
		System.out.println("Total: " + list.size() + " produk");
	}
	
	public static void main(String[] args) {
	    ArrayList<Product> productList = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

	    // Add produk via terminal
	    String lagi = "ya";
	    while (lagi.equalsIgnoreCase("ya")) {

	        System.out.println("\nPilih jenis produk:");
	        System.out.println("1. AudioPlayer");
	        System.out.println("2. MoviePlayer");
	        System.out.print("Pilihan: ");
	        int pilihan = Integer.parseInt(scanner.nextLine());

	        if (pilihan == 1) {
	            System.out.print("Nama produk: ");
	            String nama = scanner.nextLine();
	            System.out.print("Audio Spec: ");
	            String spec = scanner.nextLine();
	            productList.add(new AudioPlayer(nama, spec));

	        } else if (pilihan == 2) {
	            System.out.print("Nama produk: ");
	            String nama = scanner.nextLine();
	            System.out.print("Resolusi (contoh: 1080p): ");
	            String resolusi = scanner.nextLine();
	            System.out.print("Refresh Rate: ");
	            int refresh = Integer.parseInt(scanner.nextLine());
	            System.out.print("Response Time: ");
	            int response = Integer.parseInt(scanner.nextLine());
	            System.out.println("Monitor Type (1. LCD / 2. LED): ");
	            int monitor = Integer.parseInt(scanner.nextLine());
	            MonitorType monitorType = (monitor == 1) ? MonitorType.LCD : MonitorType.LED;
	            productList.add(new MoviePlayer(nama, new Screen(resolusi, refresh, response), monitorType));

	        } else {
	            System.out.println("Pilihan tidak valid!");
	        }

	        System.out.print("\nTambah produk lagi? (ya/tidak): ");
	        lagi = scanner.nextLine();
	    }

	    // Tampilkan sebelum sorting
	    System.out.println("\n===== SEBELUM SORTING =====");
	    print(productList);

	    // Sorting
	    Collections.sort(productList);
	    System.out.println("\n===== SETELAH SORTING =====");
	    print(productList);

	    // Search
	    System.out.print("\nCari produk: ");
	    String keyword = scanner.nextLine();
	    searchByName(productList, keyword);

	    scanner.close();
	}
	
	public static void searchByName(ArrayList<Product> list, String keyword) {
	    System.out.println("===== HASIL PENCARIAN: " + keyword + " =====");
	    boolean ketemu = false;

	    for (Product p : list) {
	        if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
	            System.out.println(p);
	            System.out.println("-------------------");
	            ketemu = true;
	        }
	    }

	    if (!ketemu) {
	        System.out.println("Produk tidak ditemukan!");
	    }
	}
	

	
}
