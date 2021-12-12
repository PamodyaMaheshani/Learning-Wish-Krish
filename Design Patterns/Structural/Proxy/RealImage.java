/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : RealImage
 * Committed and pushed to Learning-With-Krish repository
 */


package Proxy;

public class RealImage implements Image {
	
	public String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying: " + fileName);		
	}
	
	private void loadFromDisk(String filString) {
		System.out.println("Loading:  " + fileName);	
	}
}
