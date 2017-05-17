//Colby McDevitt
//April 11, 2017
//CPSC 210000-LT1
//spring 2017
//Programming Assignment #2




import java.util.*;
import java.lang.*;
import java.text.*;



public class Figures {
	private int size;
	
	//initialize size variable for user input
	
	public static void main(String[] args) {
	
		System.out.println("CP 210"+"\nNAME: Colby McDevitt"+"\nProgramming Assignment 2\n"); //prints name and assignment to console
		
		System.out.println("Enter the size of the figure (odd number):"); //asks user for size 
		Scanner sizeScan = new Scanner(System.in);
		
		String inSize = sizeScan.nextLine();//takes user input
		
		while (inSize != ""){
			try{
				int setSize = Integer.parseInt(inSize);
				//checks if input is integer

				if (setSize % 2 == 0){
					System.out.println("Invalid figure size - must be an odd number" +"\n\nRenter the size of the figure:");
					inSize = sizeScan.nextLine();
				}//checks if input number is odd, prints invalid message			
				else if (setSize %2 != 0){
				Figures fig1 = new Figures(setSize);	
				
				}//if odd, creates new Figure object
				
				
			}
			catch (Exception e){
				System.out.println("Invalid figure size - must be an odd number" +"\n\nRenter the size of the figure");
				inSize = sizeScan.nextLine();
			}// prints if user input is not an integer
		}
		
		

	}
	public Figures(int getSize){
		size = getSize; //sets size to input integer
		System.out.println("Menu:\n1. Print Box\n2. Print diamond\n3. Print X\n4. Quit program\n\nPlease select an option:");
		//prints menu of figure options
		Scanner menuScan = new Scanner(System.in);
		
		String inMenu = menuScan.nextLine(); //get user menu option
		//chooses which figure to print and asks for user menu option again
		while (inMenu != ""){
			try{
			int menu = Integer.parseInt(inMenu);	
			
			if (menu == 1){
				printBox(size);
				Figures fig1 = new Figures(getSize);
				}// prints box
			else if (menu == 2){
				printDiamond(size);
				Figures fig1 = new Figures(getSize);
			}//prints diamond
			else if (menu == 3){
				printX(size);
				Figures fig1 = new Figures(getSize);
			}//prints x
			else if (menu == 4){
				System.out.println("Good bye!");
				System.exit(0);
			}//quits program
		else {
			System.out.println("Menu:\n1. Print Box\n2. Print diamond\n3. Print X\n4. Quit program\n\nPlease select an option:");
			//prints menu of figure options
			 inMenu = menuScan.nextLine();
			
			}//prints if invalid input for menu option
		
			}
			catch (Exception g){
				System.out.println("That is not a Menu option:" +"\nMenu:\n1. Print Box\n2. Print diamond\n3. Print X\n4. Quit program\n\nPlease select an option:");
				//prints menu of figure options
				 inMenu = menuScan.nextLine();
			}//prints if invalid input for menu option
		}
		
	}
	public static void printBox(int size){
		 String row = "";
		  String col = "";
		  String equis = "X";
		  
		for (int i = 0; i < size; i++){
			row += equis;	
		}//makes row of x's to input size
		
		for (int k = 0; k < size; k++){
			col += (row + "\n");
		}//makes rows into boxes
		System.out.println(col);
		
	}//prints box to console 
		
	public static void printDiamond(int size){	
		
		int halfSize = size / 2; //creates number of spaces needed
		String row = "";
		String col = "";
		String equis = "X";
		String spRow = "";
		String fRow = "";
		String sbRow = "";
		String bRow = "";
		String space = " ";//initialize string variables
		
		for (int k = 0; k <= halfSize; k++){
			spRow = "";//starts the first spaces in diamond over at null
			
			
		for (int i = 0; i <= (halfSize-k); i++){
			spRow += space; //creates number of spaces before X
		} 
			
			fRow = spRow + equis;//creates first half of row

			bRow += space;//creates space between X's
			
			 row = fRow + bRow + bRow + equis;//creates complete row
			 System.out.println(row);//prints to screen
		}//top of diamond
		fRow = " ";
		for (int k = 1; k <= halfSize; k++){
			spRow = ""; //starts the first spaces in diamond over at null
			
			for (int i = 0; i <= (halfSize-k); i++){
				spRow += space; 
			} //creates number of spaces before X
			
			bRow = spRow + spRow + equis;//creates first half of row
			fRow += space; //spaces between X's
			 row = fRow + equis + bRow;//complete row
			 System.out.println(row);//print to screen
		}
		}//bottom of diamond
		
		
			 
		 
	
	
public static void printX(int size){	
	int halfSize = size / 2; //creates number of spaces needed
	String row = "";
	String col = "";
	String equis = "X";
	String spRow = "";
	String fRow = "";
	String sbRow = "";
	String bRow = "";
	String space = " ";//initialize string variables
	
	for (int k = 0; k < halfSize; k++){
		spRow = ""; //resets spaces to null 
		
		
		for (int i = 1; i <= (halfSize-k); i++){
			spRow += space; //creates spaces between x's
		} 
		
		bRow = spRow + spRow + equis; //creates first half of row
		fRow += space;//creates spaces between x's
		 row = fRow + equis + bRow;//creates complete row
		 System.out.println(row);//prints to screen
	}//top half of X
	
	row = fRow + space + equis;//makes middle x
	System.out.println(row);//prints middle x
	bRow = "";//resets bRow
	
	for (int k = 0; k < halfSize; k++){
		spRow = ""; //resets spaces to null
		
		
	for (int i = 1; i <= (halfSize-k); i++){
		spRow += space; //creates spaces between x"s
	} 
		
		fRow = spRow + equis;//first half of row

		bRow += space;//spaces between X's
		
		 row = fRow + bRow + bRow + equis;//creates complete row
		 System.out.println(row);//prints to screen
	}
	}//bottom half of X
}
