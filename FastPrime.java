//Colby McDevitt
//CP 245
//Spring Semester
//Week 6 Assignment
//FastPrime.exe and program.cs

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



import java.io.*;
import java.nio.*;


public class FastPrime {

	private String userIn1, userIn2;
	private static int setNum1, setNum2, count;
	private int startNum, endNum;
	private String printout;
	private static Scanner numScan = new Scanner(System.in);//intialize objects
	
	public FastPrime(int num1, int num2) throws IOException{
		startNum = num1;
		endNum = num2;
		getPrimes(startNum, endNum);//calls get primes method
		
		
	}
	
	public static void main(String[] args) throws IOException{
		
		
		System.out.println("CP 245"+"\nNAME: Colby McDevitt"+"\nProgramming Assignment week 5\n"); //prints name and assignment to console
		//prints name 
		System.out.println("Welcome to the prime number finder, enter the starting number(integer that is 2 or bigger):"); //asks user for size 
		//prints to get user input
		String userIn1 = numScan.nextLine();//takes in first number(or invalid input)
	//takes in user input
		int num1 = checkVal(userIn1);
		//checks that input is valid
		
		System.out.println("Enter the ending number:"); //asks user for size 
		String userIn2 = numScan.nextLine();
		int num2 = checkVal(userIn2);
		//checks that ending number input is valid
		FastPrime instance = new FastPrime(num1, num2);
		//creates instance of FastPrime
		
			
				
			}
				

	
				
		public static int checkVal( String userIn1){
			//checks for valid input
		
			while (userIn1 !=""){
				try{
					int setNum1 = Integer.parseInt(userIn1);
					//checks if input is integer

					if (setNum1 < 2 || setNum1 > 500000000){
						System.out.println("Invalid Input - must be integer 2 or BIGGER" +"\n\nRenter the number:");
						userIn1 = numScan.nextLine();
					}//checks if input number is positive, prints invalid message			
					
					else if (setNum1 >= 2 && setNum1 <= 500000000){
						return setNum1;				
					}//returns number if valid
				}catch (Exception f){
						System.out.println("Invalid input -must be integer 2 or BIGGER " +"\n\nRenter the starting number:");
						userIn1 = numScan.nextLine();
					}// prints if user input is not an integer
			}return setNum1;	//returns number if valid
		}
			
	
	public static void getPrimes(int startNum, int endNum) throws IOException{
		
		if (endNum < startNum){
			getPrimes(endNum, startNum);
		}//makes sure smaller number is first input
		
		System.out.println("These are the Primes between your numbers:");
//prints to console
		String file = "FastPrime.txt";
		//creates text file name
		FileWriter fw = new FileWriter(file);//create file disk space
		BufferedWriter bw = new BufferedWriter(fw);//allows for writing more than one char at a time
		PrintWriter outFile = new PrintWriter(bw);//takes input to write to file
		//print objects to create text file
		
		 	int count = endNum - startNum;
		 	//makes size for array
		 	if (startNum%2 ==0 && endNum%2 ==0){
		 	int[] numList = new int[count/2];
		 	int[] oddList = new int[endNum/2];
			//makes array if both start and end numer are even
			for (int i = 0; i <= endNum/2-1; i++){
						oddList[i]= 3 + (i*2);
			}//list of odd numbers up to ending value
		
		if (startNum % 2 !=0 ){
			for (int n = 0; n <= count/2-1; n++){
				numList[n]= startNum + (n*2);
			}//list of odd numbers between input values if start is odd
		}
		else{
			for (int k =0; k<= count/2-1; k++){
				int evenNum = startNum+1;
				
				numList[k]= evenNum +(k*2);	
			}//list of odd numbers between input values if start is even
			
		}
		
		
		
		try{
			
				for (int h = 0; h <=(count/2)-1; h++){
					int div =0;
				for(int j=0; j<=(endNum/2)-1; j++){
					int  check = numList[((count/2)-1) -h]%oddList[j];
				//checks for even division
				 if (check == 0){div++;}
				 
				}//totals even disivions
				 if (div<=1){
						//prints if only one even division occured
					 System.out.println(numList[((count/2)-1) -h]);
						
						outFile.print(numList[((count/2)-1) -h]);//writes data to file
						outFile.println();
				 }
		
			}
						
			
	}catch (ArithmeticException e){;}
		 	}
		 	
		 	else{
		 	int[] numList = new int[count/2+1];
		 	int[] oddList = new int[count/2+1];
			//creates arrays if one or both end values are odd
			for (int i = 0; i <= count/2; i++){
						oddList[i]= 3 + (i*2);
			}//creates odd number array to end number
		
		if (startNum % 2 !=0 ){
			for (int n = 0; n <= count/2; n++){
				numList[n]= startNum + (n*2);
			}
		}//creates odd number array between input values odd start
		else{
			for (int k =0; k<= count/2; k++){
				int evenNum = startNum+1;
				
				numList[k]= evenNum +(k*2);	
			}
			//creates odd number array between input values even start
		}
		
		
		
		try{
			
				for (int h = 0; h <=count/2; h++){
					int div = 0;
				for(int j=0; j<=(count/2); j++){
					int  check = numList[count/2 -h]%oddList[j];
				//check for even division
					 if (check == 0){div++;}
					 
				}//totals even divisions
				 if (div<=1){
						//prints if even division was one or less 
					 System.out.println(numList[count/2 -h]);
						
						outFile.print(numList[count/2 -h]);//writes data to file
						outFile.println();
				 
				
				}
		
			}
						
			
	}catch (ArithmeticException e){;}
		 	}
		 	
		 	if (startNum == 2){
				System.out.println("2");
				outFile.print("2");
				outFile.println();
				//prints 2 to the list if start value is 2
			}
		outFile.close();//closes file
		System.exit(0);//terminates program
	
	}



}




		
