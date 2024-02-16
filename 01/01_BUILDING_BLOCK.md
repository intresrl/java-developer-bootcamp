# BUILDING BLOCK (01)

## Java Commands 
- javac: convert .java file in .class bytecode file
- java: executes the programs
- jar: packages of files
- javadoc: generates documentation

## Class Structure
- fields -> variables
- methods -> functions, procedures

## main() method
Main methods is entry point for our Java programs.  
Main's parameter list can be used in these options:
- String[] args
- String options[]
- String... friends

## Understanding package declarations and imports
### Compiling and running code with packages
To compile a java class you can use javac command, like this example:  
`javac -d target packagea/ClassA.java packageb/ClassB.java`  
To run the program you can use java, like this example:  
`java -cp target packageb.ClassB`

## Creating objects
### Executing instance initializer blocks
A code block is code between curly branches `{ }`   
Sometimes code blocks are inside a method, these code blocks are run when the method is called. 
When this code blocks are outside there are called *instance initializers* and these are run when the class is instanced.   

## Initializing variables
Local variables do not have a default value and must be initialized before use.