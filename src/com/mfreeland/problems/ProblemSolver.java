package com.mfreeland.problems;

import java.util.*;
import java.lang.Math;
import java.math.*;
public class ProblemSolver {
public static void main(String args[]){
		

	int problemnumber = Integer.parseInt(args[0]);
	ArrayList<Integer> problem11_list = new ArrayList<Integer>();
	if(problemnumber == 11){
		int [] bufferList = {8,2,22,97,38,15,0,40,0,75,4,5,7,78,52,12,50,77,91,8,49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,4,56,62,0,81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,3,49,13,36,65,52,70,95,23,4,60,11,42,69,24,68,56,01,32,56,71,37,2,36,91,22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80,24,47,32,60,99,3,45,2,44,75,33,53,78,36,84,20,35,17,12,50,32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70,67,26,20,68,2,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21,24,55,58,5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72,21,36,23,9,75,0,76,44,20,45,35,14,0,61,33,97,34,31,33,95,78,17,53,28,22,75,31,67,15,94,3,80,4,62,16,14,9,53,56,92,16,39,5,42,96,35,31,47,55,58,88,24,0,17,54,24,36,29,85,57,86,56,0,48,35,71,89,7,5,44,44,37,44,60,21,58,51,54,17,58,19,80,81,68,5,94,47,69,28,73,92,13,86,52,17,77,4,89,55,40,4,52,8,83,97,35,99,16,7,97,57,32,16,26,26,79,33,27,98,66,88,36,68,87,57,62,20,72,3,46,33,67,46,55,12,32,63,93,53,69,4,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36,20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,4,36,16,20,73,35,29,78,31,90,1,74,31,49,71,48,86,81,16,23,57,5,54,01,70,54,71,83,51,54,69,16,92,33,48,61,43,52,1,89,19,67,48};
		for(int i=0;i<bufferList.length;i++){
			problem11_list.add(bufferList[i]);
		}
	}

	
	switch(problemnumber){
	case 1:
		ProblemSolver.solveProblem1(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		break;
	case 2:
		ProblemSolver.solveProblem2(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		break;
	case 3:
		ProblemSolver.solveProblem3(Long.parseLong(args[1]));
		break;
	case 4:
		ProblemSolver.solveProblem4(Integer.parseInt(args[1]));
		break;
	case 5:
		ProblemSolver.solveProblem5(Integer.parseInt(args[1]));
		break;
	case 6:
		ProblemSolver.solveProblem6(Integer.parseInt(args[1]));
		break;
	case 7:
		ProblemSolver.solveProblem7(Integer.parseInt(args[1]));
		break;
	case 9: 
		ProblemSolver.solveProblem9(Integer.parseInt(args[1]));
		break;
	case 10:
		ProblemSolver.solveProblem10(Integer.parseInt(args[1]));
		break;
	case 48:
		ProblemSolver.solveProblem48(Integer.parseInt(args[1]));
		break;
	case 11:
		ProblemSolver.solveProblem11(problem11_list);
		break;
	case 12:
		ProblemSolver.solveProblem12(Integer.parseInt(args[1]));
		break;
	case 13:
		ProblemSolver.solveProblem13();
		break;
	case 14:
		ProblemSolver.solveProblem14(Integer.parseInt(args[1]));
		break;
	case 15:
		ProblemSolver.solveProblem15(args[1]);
		break;
	}
	
	}

/*private static void solveProblem15(int gridsize){
	int numberOfRoutes = RouteFinder.countRoutes(gridsize);
	System.out.println("Why hello, there: you've got "+numberOfRoutes+" routes,yo.");
}*/
private static void solveProblem15(String exponent){
	int sumOfDigits = SumOfDigits.determineSumOfPowersOfTwo(exponent);
	System.out.println("Sum: "+sumOfDigits);
}
private static void solveProblem14(int threshold){
	int maximum = LongestCollatzSequence.determineLargestCollatz(threshold); 
	System.out.println("hi! "+maximum);
}

private static void solveProblem13(ArrayList<char[]> listOfLargeNumbers){
	//break the large string into 100-50 int strings
	//pass the list of 100-50 int strings to the evaluateSum
	//
//	BigInteger sum = LargeSum.evaluateSum(listOfLargeNumbers);
	/*for(int i : sum){
		System.out.println(i);
	}
	for(char[] number:listOfLargeNumbers){
		System.out.println();
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]);
		}
	}*/
	//Long first10 = LargeSum.getFirst10Digits(sum);
//	System.out.println(sum);
	
}
private static void solveProblem12(Integer numberOfFactors){
	DivisibleTriangularNumber.findSmallestTriangularNumber(numberOfFactors);	
}
private static void solveProblem11(ArrayList<Integer> myGrid){
	LargestProductInGrid largest = new LargestProductInGrid(myGrid, 20);
	largest.determineMax();
	System.out.println(largest.getMax());		
}
private static void solveProblem10(int threshold){
	System.out.println(Primes.getSumOfPrimes(threshold));
}
private static void solveProblem9(int number){
	System.out.println(SpecialPythagoreanTriple.getProductOfComponents(SpecialPythagoreanTriple.getUniqueTriple(number)));
}
private static void solveProblem7(int number){
	System.out.println(LargestProduct.getLargestProductInSeries(LargestProduct.longstring));
}
private static void solveProblem6(int upperBound){
	System.out.println(SumSquareDifference.differenceOfSquares(upperBound));
	
}
private static void solveProblem5(int upperBound){
	System.out.println(SmallestMultiple.generateSmallestMultiple(upperBound));
	
}
private static void solveProblem48(int threshold) {
	//This is such a slow algorithm ...
	System.out.println("Your sum is: "+SumExponential.sumExponentials(threshold));
	
}
private static void solveProblem4(int checkFunction){
	System.out.println(Palindrome.largestPalindrome());
}
private static void solveProblem3(long numberToCheck){
	
	ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
	for(int i: PrimeFactor.generateFactors((int)Math.ceil(numberToCheck), numberToCheck)){
		if(PrimeFactor.isPrime(i)){
			listOfPrimes.add(i);
		}
		
	}
	int largestPrime = PrimeFactor.largestPrimeFactor(listOfPrimes,numberToCheck);
	System.out.println("The largest Prime Factor of "+numberToCheck+" is "+largestPrime);
}

private static void solveProblem2(int factor, int threshold) {
	FibonacciSequence fs = new FibonacciSequence();
	fs.printFibonacciList(fs.generateFibonacciList(threshold));
	SummingMultiples sm = new SummingMultiples();
	int sum = sm.generateSum(factor, fs.generateFibonacciList(threshold));
	System.out.println("The answer to problem 2 is: "+sum);
	
}

private static void solveProblem1(int n1, int n2, int threshold) {
	
	SummingMultiples sm = new SummingMultiples();
	System.out.println("The answer to problem 1 is: "+sm.generateSum(n1,n2,threshold));
	
}


}
