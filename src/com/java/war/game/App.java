package com.java.war.game;

import java.util.List;
import java.util.Scanner;

public class App {
 static Scanner input = new Scanner(System.in);
 
 
	public static void main(String[] args) {
	//Create the deck of cards	
	Deck deckOfCards = new Deck();
	
	//Create two players
	Player player1 = new Player();
	Player player2 = new Player();
	
	//Set players names
	System.out.println("-----------------------------------");
	System.out.println(    "Welcome to the Game of WAR!!");
	System.out.println("-----------------------------------");
	System.out.println();
	System.out.print("Enter the name of player 1 : ");
	String name1 = input.next();
	player1.setName(name1);
	System.out.print("Enter the name of player 2 : ");
	String name2 = input.next();
	player2.setName(name2);
	System.out.println();
	
	//Shuffle the deck of cards
	deckOfCards.shuffle();
	
	//Dealing the cards to each player
	for(int i=0; i < 52; i++) {
		if (i % 2 == 0) {			
			player1.setPlayerHand(player1.draw(deckOfCards));
		}else {
			player2.setPlayerHand(player2.draw(deckOfCards));
	    }
	}	
	
	//Each player flips a card to see which card is larger. The larger card
	//gets the point and the score is incremented by one.
	while(!player1.getPlayerHand().isEmpty() && !player2.getPlayerHand().isEmpty()) {
		Card playerOneFlip = player1.flip();
		Card playerTwoFlip = player2.flip();
		
		//Getting the value of each players card
		String value1 = playerOneFlip.getValue();
		String value2 = playerTwoFlip.getValue();
		
		//methods to do the comparison and return the values
		int player1Value = player1.compareValue1(value1, value2);
		int player2Value = player2.compareValue2(value1, value2);
		boolean isEqual = player1.isEqual(value1, value2);
		
		
		//Comparing each value and seeing who won the draw here
		if(player1Value > player2Value) {
			player1.incrementScore();
			System.out.println(player1.getName() + " Card : " + playerOneFlip.describe());
			System.out.println(player2.getName() + " Card : " + playerTwoFlip.describe());
			System.out.println(player1.getName() + " Gets the point! The card was: "
				+ 	playerOneFlip.describe());
			System.out.println("Total Points for: " + player1.getName() + " " + player1.getScore());
			System.out.println();
		}else if (player2Value > player1Value) {
			player2.incrementScore();
			System.out.println(player1.getName() + " Card : " + playerOneFlip.describe());
			System.out.println(player2.getName() + " Card : " + playerTwoFlip.describe());
			System.out.println(player2.getName() + " Gets the point! The card was: " 
					+ playerTwoFlip.describe());
			System.out.println("Total Points for: " + player2.getName() + " " + player2.getScore());
			System.out.println();
		}else if (isEqual){
			System.out.println(player1.getName() + " Card : " + playerOneFlip.describe());
			System.out.println(player2.getName() + " Card : " + playerTwoFlip.describe());
			System.out.println("It's a Tie! No point awarded" );
			System.out.println();
		}
		
	}
	
	//Reveals the winner of the game. If no winner it is a draw.
	if (player1.getScore() > player2.getScore()) {
		System.out.println();
		System.out.println("Total Points for: " + player1.getName() + " " + player1.getScore());
		System.out.println("Total Points for: " + player2.getName() + " " + player2.getScore());
		System.out.println( player1.getName() + 
				" score is: " + player1.getScore() + " ." + " You win!");
	}else if (player2.getScore() > player1.getScore()) {
		System.out.println();
		System.out.println("Total Points for: " + player2.getName() + " " + player2.getScore());
		System.out.println("Total Points for: " + player1.getName() + " " + player1.getScore());
		System.out.println(player2.getName()
				+ " score is: " + player2.getScore() + "." + " You win!");
	}else {
		System.out.println("Total Points for: " + player2.getName() + " " + player2.getScore());
		System.out.println("Total Points for: " + player1.getName() + " " + player1.getScore());
		System.out.println("It's a draw! No winner, try again!");
	}	
	
  }
}
