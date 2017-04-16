package com.mfreeland.problems;

public class Palindrome {

	protected static int largestPalindrome(){
		//what is one way that this can be solved?
		//I can start by multiplying the two largest 3 digit numbers together
		//Then I will decrease one of the numbers while it is greater than 99
		//Then I will set this number to 998 (or largeNumber - 1) and set largeNumber=largeNumber-1
		//Then I will
		
		//The above is not going to be the most efficient & scalable solution
		//however, it should still solve the problem
		
		
		
		
		int product = 0;
		int palindrome = 0;
		int newPalindrome=0;
		int largeNumber = 1000;
		int smallNumber = 999;
		boolean pal = false;
		while(largeNumber>99){
			smallNumber = largeNumber-1;
			largeNumber = largeNumber-1;
			
			while(smallNumber>99){
				if(isPalindrome(smallNumber*largeNumber)){
					if(smallNumber*largeNumber > palindrome){
						palindrome=smallNumber*largeNumber;	
						System.out.println("Large Num: "+ largeNumber);			
						System.out.println("Small Num: "+ smallNumber);
					}
					
					
				}
				smallNumber--;
			}
			
		}
		
		
			
		return palindrome;
	}
	
	protected static boolean isPalindrome(int pal){
		boolean ispal=false;
		int length = String.valueOf(pal).length();
		int [] asArray = new int[length];
		int i=0;
		while(i < length){
			asArray[i] = pal%10;
			pal=pal-asArray[i];
			pal=pal/10;
			i++;		
		}
		int w = 0;
		boolean myBool = true;
		while(w<length/2){
			if(asArray[w] != asArray[length-1-w]){
				myBool = false;
			}
			w++;
		}
		
		ispal = myBool;
		
		return ispal;
	}
}
