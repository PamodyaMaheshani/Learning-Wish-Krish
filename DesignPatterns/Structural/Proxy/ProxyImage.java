/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : ProxyImage
 * Committed and pushed to Learning-With-Krish repository
 */


package Proxy;

public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();		
	}

}
