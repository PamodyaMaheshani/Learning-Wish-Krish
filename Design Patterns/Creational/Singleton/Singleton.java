package Singleton;

public class Singleton {

	// A static instance
	private static Singleton uniqueInstance;
	
	// need to have a private constructor to block multiple instances
	private Singleton() {}
	
	// synchronized - overcome the multiple threading issue. 
	public static Singleton getInstance() {
		
		// lazy loading - it is created only when the method creating the instance is first called.
		if (uniqueInstance == null) {
			synchronized (Singleton2.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		return uniqueInstance;
	}
}
