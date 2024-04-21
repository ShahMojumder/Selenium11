package javaDemo;
//8.Create an array of 10 students of Selenium QA class and print all students name on the console by using for each loop 
//(use Array creation way-1).


public class Array_Loop {
                                                   //WAY 1 
	public static void main(String[] args) {
		String[]student = {"david","kathy","robert","sam","rabi","shah","farhana","erica","denia","tara"};
      for( String selenium : student  ) {
    	  System.out.println(selenium);
      }
      //9.	Write an array of 20 employees ID numbers of an organization and print all the id of employees on the console by using for each loop
      //(use Array creation way-2).
      
                                               //WAY 2
 
      
      //ClassName obj = new ClassName();

      //String[ ] obj = new String[4];
      int [] emp = new int [11];
      emp[0]=   123;
      emp[1]=   235;
      emp[2]=	535;
      emp[3]=	336;
      emp[4]=	563;
      emp[5]=	336;
      emp[6]=	442;
      emp[7]=	555;
      emp[8]=	127;
      emp[9]=	852;
      emp[10]=	666;
      
   for( int number : emp)  {
	   System.out.println(number);
   } 
      
      
      
	
	}
}

