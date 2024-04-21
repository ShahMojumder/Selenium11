package javaDemo;

import java.util.ArrayList;
import java.util.List;

//Create a list of 10 employees(names & id) by using ArrayList and LinkedList and implements all of the methods


public class List_Array {

	public static void main(String[] args) {
		//List<Integer> id = new ArrayList<Integer>();
 		List<Integer> id = new ArrayList<Integer>();
		id.add(20);
		id.add(40);
		id.add(40);
		id.add(52);
		id.add(12);
		id.add(47);
		id.add(132);
		id.add(15);
		id.add(336);
		id.remove(5);
		id.remove(2);
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("maintain inserting order");
		//for(Integer eachlist : id) 
			//System.out.println(eachlist);
		for(int i = 0; i<=7; i++) {
			System.out.println(i);
		}
			
			
		
		

	}

}
