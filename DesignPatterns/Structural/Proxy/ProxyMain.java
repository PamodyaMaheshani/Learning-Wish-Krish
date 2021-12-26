/*
 * Created by Pamodya Maheshani
 * Created on 12/12/2021
 * Class name : ProxyMain
 * Committed and pushed to Learning-With-Krish repository
 */

package Proxy;

public class ProxyMain {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10.jpg");

		image.display();
		System.out.println(" ");
		
		image.display();
	}
}
