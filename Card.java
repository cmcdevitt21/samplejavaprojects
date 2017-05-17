
import java.util.*;
import java.lang.*;


//Lab 4 Ex #3
public class Card {

	
	private int cardSuit;
	private int cardValue;
	private String showCard;
	private String showSuit;
	private String printCard;
	private static int dealNum;
	
public static void main(String[] args) {
		
		System.out.println("How many cards do you want in your hand?\nEnter an integer:");
		Scanner scan = new Scanner(System.in);
		int dealNum = scan.nextInt();
		
	
	Card card1 = new Card(dealNum); //make new instance to "deal" cards
	
	}

	
	public Card(int hand){ //input card to be dealt
	


		Random gen = new Random(); //for random card choice
		for (int i =1; i<= hand; i++){
			
		
		cardSuit = gen.nextInt(3);
		cardValue = 1 + gen.nextInt(12);
		
		switch (cardSuit){//random chooses suit
		case 0:
			showSuit = "spades";
			break;
		case 1:
			showSuit = "clubs";
			break;
		case 2:
			showSuit = "diamonds";
			break;
		case 3:
			showSuit = "hearts";
			break;
			default:
		}
		switch (cardValue){//random chooses card value
		case 1:
			showCard = "Ace";
			break;
		case 2:
			showCard = "Two";
			break;
		case 3:
			showCard = "Three";
			break;
		case 4:
			showCard = "Four";
			break;
		case 5:
			showCard = "Five";
			break;
		case 6:
			showCard = "Six";
			break;
		case 7:
			showCard = "Seven";
			break;
		case 8:
			showCard = "Eigth";
			break;
		case 9:
			showCard = "Nine";
			break;
		case 10:
			showCard = "Ten";
			break;
		case 11:
			showCard = "Jack";
			break;
		case 12:
			showCard = "Queen";
			break;
		case 13:
			showCard = "King";
			break;
			default:
	}
		printCard = showCard + "\tof\t" + showSuit;
		System.out.println(printCard);
		}//prints out cards to console
		
	}
	
}
