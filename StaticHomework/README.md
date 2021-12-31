Static Block:

Simply, if the ‘static’ keyword is used when declaring a block, that block is called as static block.  It is called as static initialization block too. A static block can be identified as a set of instructions that is run only once when a class is loaded into memory by Java ClassLoader. This is because it is an option for initializing or setting up the class at run-time. The keyword 'static' indicates that it spans all instances of the class. It is like a mini-global set of instructions.
Normally, static block is executed before the main method in a class. Why is that? There are 2 actions done by the JVM when executing a java class. First JVM loads the bytecode of the java class into the memory. While processing the loading, static block is executed. After the loading process, the main method starts its execution. So, that’s why static block is executed at the first. Bytecode is loaded to the memory only one time. 
If it needs to access two times to the class using 2 different objects, why the statis block is only accessed through the first object?? Suppose in the Blocks class  static block print statement – ‘Inside the static block’. In the main class, it accesses that Blocks class twice using object1 and object2. When executing, this should give 2 statements of  ‘Inside the static block’. But it only gives one statement. Why is that? Though it is created two objects, bytecode class file is loaded only one time into the memory. Therefore, only one-time static block will be executed.
If we have multiple static blocks inside a class, the order for executing those multiple static blocks are the order they were declared.
Why we use static block in Java: 
1.	The main purpose of declaring a static block id to implement the login inside the static block that needs to execute during the class loading. 
2.	To initialize static variables of the class.
3.	Mostly used for changing default value of static variables. 
The static block cannot be declared in any method of a class. In the execution, JVM first executes the static block before main method when loading the bytecode to the memory.

 
Empty Block:

Constructor Block:

The order of executing these blocks:
1.Static Block
2.Empty Block
3.Constructor Block
