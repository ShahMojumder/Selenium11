package stringConcept;

public class Equals {

	public static void main(String[] args) {
		//Strings are used for storing text in a variable.

//A String variable contains a collection of characters surrounded
		//by double quotes ex. ("Mamun"),

				String text = "String Concept"; //123
				String text1 = "String Concept"; //123
		System.out.println(text);
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text));

		//If you want to concat different datatype variable, we use + 
		String num = "20";
		String num1 ="30";
		int a = 10;
		int b = 20;
		System.out.println(num + a);
		System.out.println(a+b);
		//if you want to Concat (join more than one Strings) two String
		System.out.println(text.concat(text1)); 
		System.out.println(text.equals(text1));
		System.out.println(text1.equals(text));
		System.out.println(text.contains(text1));
		System.out.println(text==text1);
		
		String name ="i am a mamun";
		String name1= "i am a mamun";
		System.out.println(name.concat(name1).trim()
				);
		System.out.println(text.trim().trim());
		System.out.println(text+"     "+text1);
		System.out.println(name+"  "+name1);



		//4. trim()- want to remove white space from both side of a String use- trim()
		String line = "    Java String concept    ";
			System.out.println(line);
			System.out.println(line.length());
			System.out.println(line.trim());
			//After use -trim()
			//System.out.println(line.trim().length());
			//System.out.println(line.length());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
