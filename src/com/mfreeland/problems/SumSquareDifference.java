package com.mfreeland.problems;

public class SumSquareDifference {
	
	protected static long differenceOfSquares(int i){
		
		return squareOfSum(i)-sumOfSquare(i);
	}
	protected static long sumOfSquare(int i){
		
		long sum = 0;
		long square;
		for(long j=1;j<=i;j++){
			square=j*j;
			sum+=square;
		}

		return sum;

	}
	protected static long squareOfSum(int i){
		
		return generateSum(i)*generateSum(i);	
			
	}
	protected static long generateSum(int i){
		
		long sum = 0;
		for(long j=1;j<=i;j++){
			sum+=j;
		}
		
		return sum;
	}
	
	
}
