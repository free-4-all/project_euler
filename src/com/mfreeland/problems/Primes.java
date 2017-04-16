package com.mfreeland.problems;

public class Primes {

	public static void main(String [] args){
		
		System.out.println(getNthPrime(10001));
		
	}
	
	protected static long getNthPrime(int n){
		
		int count=0;
		long currentPosition = 2;
		long count_thPrime = 2;
		while(count<n){
			if(isPrime(currentPosition)){
				count++;
				count_thPrime = currentPosition;
			}
			currentPosition++;
		}
		return count_thPrime;
	}
	
	protected static boolean isPrime(long i){
		
		boolean isPrime=true;
		
		for(long j=(long)Math.floor(i/2);j>1;j--){
			if(i%j==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	protected static long getSumOfPrimes(long threshold){
		long sum =0;
		for(long i = 2; i<threshold; i++){
			if(isPrime(i)){
				sum = sum+i;
			}
		}
		
		return sum;
		
	}
}
