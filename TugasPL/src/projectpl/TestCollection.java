package projectpl;
import java.util.ArrayList;
import java.util.Collections;

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
        

        // Nanti diganti AudioPlayer & MoviePlayer, nunggu pajar & aisyah
        productList.add(new AudioPlayer("Speaker JBL", "MP3"));
        productList.add(new AudioPlayer("Apple iPod", "AAC"));
        
        
        productList.add(new MoviePlayer("Samsung TV", new Screen("1080p", 60, 5), MonitorType.LED));
        productList.add(new MoviePlayer("LG Monitor", new Screen("600x400", 40, 22), MonitorType.LCD));
        // Step 15 - sebelum sorting
        System.out.println("===== SEBELUM SORTING =====");
        print(productList);

        // Step 14 & 15 - sorting by name
        Collections.sort(productList);

        // Step 15 - sorting
        System.out.println("\n===== SETELAH SORTING =====");
        print(productList);
	}
	
	// step 17 print cuman audio player
//	System.out.println("=== HANYA AUDIO PLAYER ===");
//	Product.printType(productList, AudioPlayer.class);
//
//	//  step 17 print cuman movie player
//	System.out.println("=== HANYA MOVIE PLAYER ===");
//	Product.printType(productList, MoviePlayer.class);
//	
	
}
