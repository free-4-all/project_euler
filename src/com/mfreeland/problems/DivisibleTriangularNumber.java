package com.mfreeland.problems;

import java.util.ArrayList;

public class DivisibleTriangularNumber {

	/*
	 * The algorithm used by this class can definitely be more efficient... Think about enhancements for the future
	 * 
	 * From a high level, this program has to accomplish the following:
	 * 
	 * Need to compute the triangle numbers (1+2+3+4+5+...+n)
	 * Need to check each number:
	 * is it prime?
	 * 		yes: do nothing else
	 * 		no: check how many divisors it has.
	 */
	
	//can use Primes.isPrime(triangularNumber) -- to check to see whether n is prime...
	
	protected static void findSmallestTriangularNumber(Integer numberOfFactors){
		int numDivisors=2;
		int triangularNumber=0;
		int i = 0;
		while(numDivisors < numberOfFactors){
			i++;
			//determine the triangular number
			triangularNumber=triangularNumber+i;
			//check whether the triangular number is prime
			if(!Primes.isPrime(triangularNumber)){
				//determineNumberOfFactors
				numDivisors=determineNumberOfFactors(triangularNumber);
			}
			System.out.println("The current integer, "+i);
			System.out.println("Triangular Number: "+ triangularNumber);
			System.out.println("Number of divisors: "+numDivisors);
		}
		System.out.println("Triangular Number: "+ triangularNumber);
		System.out.println("Number of divisors: "+numDivisors);
	}
	protected static int determineNumberOfFactors(int currentTriangularNumber){
		int numfactors = 2;
		int fctr = (int) Math.floor(currentTriangularNumber/2);
		while(fctr > 1){
			if(currentTriangularNumber%fctr==0){
				numfactors++;
			}
			fctr--;
		}
		return numfactors;		
	}
	protected static void determineTriangularNumber(int currentNumber){
		
	}
}
