package Singleton;

public class Singleton2 {
	
	// volatile keyword is used to modify the value of a variable by different threads.
	// It tells JVM that it maybe modified by another thread. This makes class thread safe.
	private volatile static Singleton2 uniqueInstance;
		
	private Singleton2() {}
		
	public static Singleton2 getInstance() {
			
		// here it uses the double check locking.
		if (uniqueInstance == null) {
			synchronized (Singleton2.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton2();
				}
			}
		}
		
		return uniqueInstance;
		
	}	
}
