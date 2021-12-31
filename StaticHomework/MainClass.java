class MainClass {	

	static {
		System.out.println("Hi.. I am in the static method in the MainClass");	
	}

	public static void main(String[] args) {

		System.out.println("Hi.. I am in the main method in the MainClass\n");
		Blocks b1 = new Blocks();
		System.out.println("");
		Blocks b2 = new Blocks("parameterized");
	}	

	
}

	