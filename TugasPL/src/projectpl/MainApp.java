package projectpl;

import java.util.ArrayList;
import java.util.Collections;
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
			System.out.println("5. Filter by Tipe");
			System.out.println("6. Sort by Nama");
			System.out.println("7. Cari Produk");
			System.out.println("8. Simpan ke file");
			System.out.println("9. Lihat file");
			System.out.println("0. Exit");
			System.out.print("Pilih: ");

			int choice = Integer.parseInt(input.nextLine());

			switch (choice) {
			case 1:
				System.out.print("Nama produk: ");
				String namaAudio = input.nextLine();
				System.out.print("Audio Spec (MP3 / AAC): ");
				String spec = input.nextLine();
				System.out.print("Berapa unit yang diproduksi?: ");
				int jumlahAudio = Integer.parseInt(input.nextLine());

				for (int i = 0; i < jumlahAudio; i++) {
					products.add(new AudioPlayer(namaAudio, spec));
				}
				System.out.println(jumlahAudio + " Audio Player ditambahkan!");
				break;

			case 2:
				System.out.print("Nama produk: ");
				String namaMovie = input.nextLine();
				System.out.print("Resolusi: ");
				String resolusi = input.nextLine();
				System.out.print("Refresh Rate: ");
				int refresh = Integer.parseInt(input.nextLine());
				System.out.print("Response Time: ");
				int response = Integer.parseInt(input.nextLine());
				System.out.println("Monitor Type (1. LCD / 2. LED): ");
				int monitor = Integer.parseInt(input.nextLine());
				MonitorType monitorType = (monitor == 1) ? MonitorType.LCD : MonitorType.LED;
				System.out.print("Berapa unit yang diproduksi?: ");
				int jumlahMovie = Integer.parseInt(input.nextLine());

				for (int i = 0; i < jumlahMovie; i++) {
					products.add(new MoviePlayer(namaMovie, new Screen(resolusi, refresh, response), monitorType));
				}
				System.out.println(jumlahMovie + " Movie Player ditambahkan!");
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
				long uniqueCount = products.stream() // ← tambah ini
						.map(p -> p.getName()).distinct().count();

				System.out.println("Audio Player: " + audioCount);
				System.out.println("Movie Player: " + movieCount);
				System.out.println("Produk Unik: " + uniqueCount); // ← tambah ini
				break;

			case 5:
				System.out.println("\nFilter by Tipe:");
				System.out.println("1. Audio Player");
				System.out.println("2. Movie Player");
				System.out.print("Pilih: ");
				int filterPilihan = Integer.parseInt(input.nextLine());

				if (filterPilihan == 1) {
					System.out.println("\n=== DAFTAR AUDIO PLAYER ===");
					Product.printType(products, AudioPlayer.class);
				} else if (filterPilihan == 2) {
					System.out.println("\n=== DAFTAR MOVIE PLAYER ===");
					Product.printType(products, MoviePlayer.class);
				} else {
					System.out.println("Pilihan tidak valid!");
				}
				break;

			case 6:
				Collections.sort(products);
				System.out.println("Produk berhasil diurutkan!");
				for (Product p : products) {
					System.out.println("-------------------");
					System.out.println(p);
				}
				break;

			case 7:
				System.out.print("Cari produk: ");
				String keyword = input.nextLine();
				System.out.println("\n===== HASIL PENCARIAN: " + keyword + " =====");
				boolean ketemu = false;
				for (Product p : products) {
					if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
						System.out.println("-------------------");
						System.out.println(p);
						ketemu = true;
					}
				}
				if (!ketemu) {
					System.out.println("Produk tidak ditemukan!");
				}
				break;

			case 8:
				ProcessFiles pf = new ProcessFiles();
				pf.WriteFile(products);
				break;

			case 9:
				ViewFileInfo vf = new ViewFileInfo();
				vf.readFile();
				break;

			case 0:
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