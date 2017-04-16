package com.mfreeland.problems;

import java.math.BigInteger;

public class SumOfDigits {

	public static void main(String [] args){
		System.out.println("suh dude: ..."+determineSumOfPowersOfTwo("1000"));
	}
	protected static int determineSumOfPowersOfTwo(String num){
		BigInteger base = new BigInteger("2");
		BigInteger exp = new BigInteger(num);
		BigInteger total = new BigInteger("1");
		for(int i=1;i<=exp.intValue();i++){
			total = total.multiply(base);
		}
		String asString = total.toString();
		int sum = 0;
		for(int i=0; i<asString.length(); i++){
			sum += asString.charAt(i)-'0';
		}
		return sum;
	}
}
