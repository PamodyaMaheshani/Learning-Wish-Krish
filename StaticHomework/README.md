A block is set of code statements that are inside curly braces within a class, method, or a constructor. The blocks are used to group some statements together. So, using a single or less statement/s that grouped statements can be accessed. Mainly there are 3 blocks. Those are static block, empty block, and the constructor.



Static Block:

Simply, if the ‘static’ keyword is used when declaring a block, that block is called as static block.  It is called as static initialization block too. A static block can be identified as a set of instructions that is run only once when a class is loaded into memory by Java ClassLoader. This is because it is an option for initializing or setting up the class at run-time. The keyword 'static' indicates that it spans all instances of the class. It is like a mini-global set of instructions.

Normally, static block is executed before the main method in a class. Why is that? There are 2 actions done by the JVM when executing a java class. First JVM loads the bytecode of the java class into the memory. While processing the loading, static block is executed. After the loading process, the main method starts its execution. So, that’s why static block is executed at the first. Bytecode is loaded to the memory only one time. 

If it needs to access two times to the class using 2 different objects, why the statis block is only accessed through the first object?? Suppose in the Blocks class  static block print statement – ‘Inside the static block’. In the main class, it accesses that Blocks class twice using object1 and object2. When executing, this should give 2 statements of  ‘Inside the static block’. But it only gives one statement. Why is that? Though it is created two objects, bytecode class file is loaded only one time into the memory. Therefore, only one-time static block will be executed.

If we have multiple static blocks inside a class, the order for executing those multiple static blocks are the order they were declared.

Why we use static blocks in Java: 
1.	The main purpose of declaring a static block id to implement the logic inside the static block that needs to execute during the class loading. 
2.	To initialize static variables of the class.
3.	Mostly used for changing default value of static variables. 

The static block cannot be declared in any method of a class. In the static block, only static variables and methods can be declared. In the execution, JVM first executes the static block before main method when loading the bytecode to the memory.

Finally, static block helps to initialize the static data members. One class can contain more than one static blocks. If there are multiple static blocks, all of them will be executed in the order of their declaration within the class.  ‘this’ keyword cannot be used in the static block.



Empty Block:

This is also called as object block. This type of blocks contains nothing but no or few statements inside a pair of curly braces. It does not contain any block name. Just there are no or few statements inside curly braces. The main purpose of this empty blocks is to group some statements as a unit. Empty blocks can be occurred inside other statements too. 

This empty block is called when creating instances but before executing the content of the constructor. Situations that instances are created using new keyword, this empty block is called. If a program doesn’t contain any object creation, this block will not be executed. In this block, in the variable declaration, variables can be both static and non-static. As an important fact, the empty block will be called when object creation before calling the constructor. 

Why we use empty blocks in Java: 
1.	The main purpose of the empty block is to implement the logic that needs to be executed during the object creation before the execution of constructor.

The empty block depends on the object creation not the constructor execution. And also, in object creating before the constructor executes, the empty block is executed. If a class has 4 objects of another class, the empty block is called 4 times per an object. 

The empty block can be used to initialize the common part of various constructors of a class. A constructor is contained collection of statements or instructions that are executed at the time of object creation. If a class contains multiple empty blocks, they are executed the order they were implemented. ‘this’ keyword cannot be used in the static block.



Constructor Block:

constructor within a class allows constructing the object of the class at runtime. It is invoked when an instance of a class is created using the ‘new’ keyword. 

Characteristics of the Constructor:
1.	Must be the same name as class name.
2.	Should not contain any return type. If a return type is contained, when executing JVM considers this as not a constructor but a method. When executing, JVM and the compiler differentiate a constructor and a method based on the return type.
3.	Whenever an object is created, the constructor is called by the JVM. If the class does not take any constructor, in object creation, the compiler creates the default constructor automatically with the default values in the compile time. 
4.	Can be non-parameterized or parameterized.
5.	When calling constructor in object creation, JVM first allocates memory areas for variables (objects) and then execute the constructor. 
6.	The constructor is called whenever an object is created.
7.	Can only use access modifier such as public. If use other non-access modifiers, it pops up a compile time error. But better to keep in mind, it can be used other access modifiers such as private, but then that class cannot be inherited since the constructor is private.

So, this block is called in the object creation.



The order of executing these blocks:
1.	Static Block
2.	Empty Block
3.	Constructor Block


First, the JVM executes the static block. As mentioned in previously, when loading the bytecode of the java class to the memory, the static block is executed. Then after loading, the main method is executed. So, first, static block is executed. 

Other both blocks are executed in the object creation process. But empty block is executed before the constructor. So, the order for executing blocks are shown in above.
