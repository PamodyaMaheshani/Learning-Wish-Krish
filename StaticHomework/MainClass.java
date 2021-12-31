class Blocks {

	//constructor
	Blocks() 
 	{
		System.out.println("Inside the constructor block of this Blocks class");
	}	

	//Static block
	static
	{
		System.out.println("Inside the static block of this Blocks class");
	}

	//empty block
	{
		System.out.println("Inside the empty block of this Blocks class");
	}
}

class MainClass {

	public static void main(String[] args) {

		Blocks b = new Blocks();
	}	
}

