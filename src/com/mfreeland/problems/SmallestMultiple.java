package com.mfreeland.problems;

public class SmallestMultiple {
	
	public static void main(String [] args){
		long test = 120;
		System.out.println(generateSmallestMultiple(20));
		
	}
	protected static long generateSmallestMultiple(int upperBound){
		long smallest = factorial(upperBound);
		long placeholder = 20;
		while(placeholder < smallest){
			//System.out.println(placeholder);
			if(isMultiple(placeholder,upperBound)){
				smallest=placeholder;
				System.out.println(placeholder);
				break;
			}
			placeholder=placeholder+upperBound;
		}
		return smallest;
	}

	protected static long factorial(int i) {
		long fact = i;
		while(i > 1){
			i--;
			fact=fact*i;
		}
		return fact;
	}
	
	protected static boolean isMultiple(long toCheck, int upperBound){
		boolean isMult = true;
		int largest = upperBound;
		for(int i = largest; i>1; i--){
			if(toCheck%i !=0){
				isMult=false;
				break;
			}
		}
		
		return isMult;
	}
	
}
