
//Colby McDevitt
//May 12, 2017
//CPSC 210000-LT1
//spring 2017
//Programming Assignment #4

import java.util.*;



import java.lang.*;




public class Test {
 //initialize a linked list of integer type
	private static Set<Integer> link;
	
	public Test(){//creates instance of the linked list
		link = new Set<Integer>();
	}
	
	public static void main(String[] args) throws Exception{

		System.out.println("CP 210"+"\nNAME: Colby McDevitt"+"\nProgramming Assignment 4\n"+"Enter a command, add / del /exists/ and an integer:"); //prints name and assignment to console
		
		System.out.println("Enter command:"); //asks user for size 
		Scanner scan = new Scanner(System.in);
		
		String inComm = scan.nextLine();//takes user input
		
		 Test test = new Test();//new instance of the linked integer list
		
		int index = 0;
		ArrayList temp = new ArrayList();//array list for printing to console
		
		
		while (inComm != ""){
			//parses user input into command and integer, check for valid input
			//completes the command based on which case it is
			String[] userComm = new String[2];
			userComm = inComm.split("\\W");
			
			try{//checks if input is command and integer
				
				
				int getNum = Integer.parseInt(userComm[1]);
				

				//checks command for add, del, exists, or if an invalid input
				//prints message to get next command and input
				if (userComm[0].startsWith("add")){
					//adds integer to list
					if (!link.exists(getNum)){
					link.add(getNum);
					index++;
					temp.add(link.toString());
					}
				}			
				else if (userComm[0].startsWith("del")){
					//takes integer from list 
					if (link.exists(getNum)){
						link.add(getNum);
				temp.remove(link.delete(getNum));
				
					index--;
					}
				
				}else if (userComm[0].startsWith("exists")){
					//calls the exists method to check if integer is in the set
					//print true or false to console
					if (link.exists(getNum)){
					
					System.out.println("True");
					
					}else
						System.out.println("False");
					
				   
				}else{ //prints if input is not a command or formatted correctly
					System.out.println("Invald input, Enter command of add or del or exists followed by an integer:");
					
				}
				
				
			}
			catch (Exception e){
				System.out.println("Invald input, Enter command of add or del or exists followed by an integer:");
				
			}// prints if user input is invalid and exception thrown
			
			
			//prints the list to the console
			if (!userComm[0].startsWith("exists")){	
				String out = "";
				for (int j = index-1; j>=0; j--){
				 out += temp.get(j) + " ";	
				}
				System.out.println(out);
			}
			//print to take in next user command
			System.out.println("Enter command:");
			inComm = scan.nextLine();
				
		}
	}
		
		
	

	





 class Set<T> implements SetADT<T>{
		
		 
		private int count;
		private LinkedNode<T> top;
		ArrayList exList = new ArrayList();
		//initialize objects
		
		//creates instance of set with a top node
		public Set(){
			count = 0;
			top = null;
			
		}
		
		//sets the top node to the added integer 
		//(or other object if other list is created)
		//adds list to arraylist for checking exists in set
		public void add(T element){
			
			LinkedNode<T> cur = new LinkedNode(element);
			
			cur.setNext(top);
			top = cur;
			count++;
			if (exList.indexOf(element)<0){
					exList.add(element);
			}
					
		}
		
		//checks if element is in set and then removes it
		public String delete(T element){
			T test =top.getElement();
			top = top.getNext();
			String print = test.toString();
			exList.remove(element);
			count--;
			return print;
		}
		
		
		//checks to see if element is in set through arraylist
		public boolean exists(T element){
			
			
			if (exList.indexOf(element)<0){
				
				return false;
			}
			
			return true;
			
		}
		
		//returns a string for printing to the console
		public String toString(){
			
			 T result = top.getElement();
		        top = top.getNext();
		        
		  String print = result.toString();
		        return print;
		}
		
		
		
	}
	
	 
	 class EmptyCollectionException extends RuntimeException
	 {
	     
	     public EmptyCollectionException(String group)
	     {
	         super("The " + group + " is empty.");
	     }
	 }


 class LinkedNode<T> {
		private LinkedNode<T> next;
		private T element;
		
		//creates instance of linked node with current element 
		//and the next link
		public LinkedNode(){
			next = null;
			element = null;

		}
		//creates instance with taking in the actual object element
		public LinkedNode(T elem){
			next = null;
			element = elem;
		}
		
		//retrieves the next node
		public LinkedNode<T> getNext(){

			return next;
		}
		
		//initiates next link node to make availible to add
		public void setNext(LinkedNode<T> node){
			next = node;
		}
		
		//retrieves the element 
		public T getElement(){
			return element;
		}

		//stores the element in the current node
		public void setElement(T elem){
			element = elem;
	}
	
}
 interface SetADT<T>{
		
		public void add(T element);
		
		public String delete(T element);
		
		public boolean exists(T element);
		
		public String toString();
		
	}
}

