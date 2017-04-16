package com.mfreeland.problems;
import java.util.*;
import java.lang.Math;

public class PrimeFactor {

	protected static ArrayList<Integer> generateFactors(int fctr, long n1){
		ArrayList<Integer> factors = new ArrayList<Integer>(); 
		while(fctr > 1){
			if(n1%fctr==0){
				factors.add(fctr);
			}
			fctr--;
		}
		return factors;		
	}
	
	protected static boolean isPrime(int poss_prime){
		boolean prime = false;
		int poss_factor = (int)(Math.ceil(poss_prime/2));
		ArrayList<Integer> factor_list = generateFactors(poss_factor/2, poss_prime);
		if(factor_list.size()==0){
			prime = true;
		}
		
		return prime;
	}
	protected static int largestPrimeFactor(ArrayList<Integer> factorList, long num){
		int largestprime;
		if(factorList.size()!=0){
			largestprime = (int)factorList.get(0);
		}
		else{
			largestprime = (int)num;
		}
		return largestprime;
		
	}
}
