package com.mfreeland.problems;

public class LongestCollatzSequence {

	public static void main(String [] args){
		System.out.println("Drumroll, please..."+determineLargestCollatz(13));
	}
	/*TODO:
	 * 
	 * Develop Solution:
	 *    We need to iterate through each number from 1 to 999,999
	 *    
	 *    For each number we need to run the algo
	 *    
	 *    The algo is:
	 *       Generate the Collatz sequence; --- abstract this
	 *       ?Data structure for this?
	 *       well, I don't need to keep all of the numbers.
	 *       
	 *       
	 *       
	 */
	public static int determineLargestCollatz(int threshold){
		int max = 0;
		int maxIndex=0;
		int tempMax=0;
		for(int i=100000;i<1000000;i++){
			//System.out.println("hey"+i);
			tempMax=generateCollatzSequence(i);
			if(tempMax > max){
				max=tempMax;
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	public static int generateCollatzSequence(long number){
		int count = 1;
		while(number!=1){
			if((number%2) == 0){
				number = number/2;
			}else{
				number = 3*number+1;
			}
			count++;
		}
		return count;		
	}
	public static int generateCollatzSequenceRecursive(int number,int size, int finalSize){
		//Should be a recursive method...
		if(number != 1){
			if(number%2 == 0){
				number = number/2;
			}else{
				number = 3*number +1;
			}
			//add size to list
			//then identify the max of the list
			//seems like an inefficient method for solving this problem.
			//what is the best way?
			
			generateCollatzSequenceRecursive(number,size+1,finalSize);
		}else{
			//here is where I can access the size of the collatz sequence
			
			System.out.println("the final size is: "+finalSize);
		}
		return 0;
		
	}

	
	
}
