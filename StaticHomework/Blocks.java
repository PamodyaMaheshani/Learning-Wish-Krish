class Blocks {

	//default constructor
	public Blocks() 
 	{
		System.out.println("Hi.. I am in the constructor block of this Blocks class");
	}	

	//parameterized constructor
	public Blocks(String block) 
 	{
		System.out.println("Hi.. I am in the " + block + " constructor block of this Blocks class");
	}

	//Static block
	static
	{
		System.out.println("Hi.. I am in the static block of this Blocks class");
	}

	//empty block
	{
		System.out.println("Hi.. I am in the empty block of this Blocks class");
	}
}