package com.mfreeland.problems;

public class SumExponential {

	protected static long sumExponentials(int q){
		
		long sum=0;
		long iter=1;
		while(iter<=q){
			sum=(sum)+(long)Math.pow(iter, iter);
			iter++;
		}
		return sum;
	}
}
