/*
 * Kübra YAYLA
 * problem:
 * Write a program that displays all integers between low and high that are the
sum of the cube of their digits. In other words, find all numbers xyz such that
xyz = x3 + y3 + z3, for example, 153 = 13 + 53 + 33. Try 100 for low and 1000 for high
 *Date:22.07.2022
 */


import java.util.Scanner;

public class CubeOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 

		//sum of the digits
		int sum;
		int j;
	 
		for(j=100; j<1000; j++)
		{
				
	        if(getSum(j)==j) //comparing if sum is equal to the number
	        	System.out.println("----------------- ");
	        else
	        	System.out.println(j+" nope");
			
		
		}	
	}
		
		public static int getSum(int j) // getting the sum of cubes of the digits
		{
			int sum=0;
			while(j!=0)
			{
				sum += Math.pow(j%10, 3);
				j = j/10;
			}	
			return sum;
		}
		
	
}	