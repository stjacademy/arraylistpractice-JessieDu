package arraylistPractice;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList<String> band = new ArrayList<String>();
		
		band.add("Paul"); 
		band.add("Ringo");
		band.add("John"); 
		band.add("George"); 
		band.add(band.remove(0));

		System.out.println ("Band: " + band); 
		System.out.println ("Size of the band: " + band.size()); 


	}

}
