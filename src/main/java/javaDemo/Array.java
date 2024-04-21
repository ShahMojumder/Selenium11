package javaDemo;

public class Array {

	public static void main(String[] args) {
		//Syntax of Array: DataType [ ] arrays ={values separated by comma};
		//ClassName obj = new ClassName();
		/*2.	Create an array by using below marks of Mathematics of 10th Grade Students of a school.
		Marks: 60,65,70,78, 80,86,90,92,95
		a)	Print a particular index value from the array
		b)	Print gets count of array
		c)	Print all value from the array (Not covered)*/
		
		
		//way 1  Syntax of Array: DataType [ ] arrays ={values separated by comma};
		int [] num = {60,65,70,78,80,86,90,92,95};
		for (int i = 0; i < num.length; i++) {
		      System.out.println(num[i]);}
	   // System.out.println(num[8]);
	   // System.out.println(num.length);
	    /*3.	Create a list of employee name those who are working in Walmart Inc.
Employee Name: David, Smith, Erika, Priscilla, Regina, Tammy, Paul, Garcia
a)	Print Priscilla from the list
b)	 Print Gets count of list*/
	    String[] name = {"David", "Smith", "Erika", "Pricilla", "Regina", "Tammy", "Paul","Garcia"};
	    for (int i = 0; i < name.length; i++) {
		      System.out.println(name[i]);}
	    //System.out.println(name[3]);
	    //System.out.println(name.length);
/*4.What is the limitations of Arrays?
When you try to print a value of out of limit of Array, what will happen? 
Or Explain limitations/problems of the Array and when the Array shows ArrayIndexOutOfBoundExceptions, and 
print the exception in the console?*/
	    //Way 2:
	  //ClassName obj = new ClassName();
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (int i = 0; i < cars.length; i++) {
		      System.out.println(cars[i]);}
	    
	    





	}

}
