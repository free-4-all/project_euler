package com.mfreeland.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SpecialPythagoreanTriple {

	/*public static void main(String [] args){
		
		HashMap<String,Integer> myTriples = SpecialPythagoreanTriple.getUniqueTriple(1000);
		System.out.println(SpecialPythagoreanTriple.getProductOfComponents(myTriples));
		
		
	}*/
	
	protected static int getProductOfComponents(HashMap<String,Integer> triplesHashMap){
		int product = 1;
		Iterator iter = triplesHashMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry pair = (Map.Entry)iter.next();
			product=product*(Integer)pair.getValue();

		}
		
		
		return product;
		
	}
	
	protected static HashMap<String,Integer> getUniqueTriple(int sum){
	//This method will obtain the first pythagorean triple it finds when 
	//starting from c = sum - 2, while a & b start from a nonzero (i.e. 1)
		HashMap<String,Integer> triples = new HashMap<String,Integer>();
		int a;
		int b;
		int c = sum;
		boolean toEnd = false;
		//I need to check all possible combinations
		//So if I check a = 1, c = sum - b - a
		//then check if a + b + c > sum. This is my stopping point.
		//So I start at a = 1, b = 1, c = 998;
		for(a = 1; a < sum; a++){
			for(b = 1; b < sum; b++){
				c = sum - b - a;
				if(isTriple(a,b,c)){
					toEnd = true;
					triples.put("A",a);
					triples.put("B",b);
					triples.put("C",c);
					break;
				}
			}
			if(toEnd){
				break;
			}
		}
		return triples;
		
	}
	
	protected static boolean isTriple(int a, int b, int c){
		
		if((a*a) + (b*b)  == (c*c)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
