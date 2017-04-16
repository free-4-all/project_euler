package com.mfreeland.problems;

public class NumberLetterCount {

	
	//gets the count of letters summed up from the numbers 1 to n represented in letter form (1:one, 2:two, etc)
	public static long getTotalLetterCount(int n){
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum+=getLetterCount(numberLetterMap(i));
		}
	}
	//returns the letter string mapped by the specific number 
	public static String numberLetterMap(int number){
		String letters;
		int significance = 0;
		//need to determine the significance of the digit... is it ones, tens, hundreds?
		
		switch(significance){
			case '1':
				letters+=getOnesString(number);
				break;
			case '2':
				letters+=getTenthsString(number);
				break;
			case '3':
				letters+=getHundrethsString(number);
				break;
			default:
				letters+="";
				break;
		}
		return letters;
	}
	
}
