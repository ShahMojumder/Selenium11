package learn_Collection_list;



  import java.util.HashMap;

//HOME WORK
// Create 3 sets maintaining Random, Ascending, and Inserting order of 15 students (Names and IDs) of a QA class and 
//implements all of the methods set.

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.util.SystemOutLogger;

import com.google.common.collect.Multiset.Entry;

public class Set_Interface {
//Difference between set vs list is duplicate value. 
	public static void main(String[] args) {
		//Set<String> name = new HashSet<String>();
		Map<String,Integer > mp = new HashMap<String, Integer>();
		
		mp.put("mamun", 123);
		mp.put("shah", 125);
		mp.put("warren", 222);
		mp.put("john", 124);
		mp.put("smith", 125);
		mp.put("walse", 223);
		mp.put("erika", 130);
		mp.put("mary", 166);
		mp.put("warren", 229);
	System.out.println(mp);
		
System.out.println(mp.size());
	mp.get("mamun");
	System.out.println(mp.get("mamun"));
	
	for(java.util.Map.Entry<String, Integer> eachmp : mp.entrySet()){
		
		System.out.println(eachmp.getKey() +" "+ eachmp.getValue());
	}
	


	


	
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
