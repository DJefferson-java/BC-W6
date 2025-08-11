package com.java.war.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Creates a list of cards.
	private List<Card> hand =  new ArrayList<Card>();
	//To keep score
	private int score;
	//Player's name
	private String name;
	//Indicates what Round we are on
	private int round = 0;
	
	//Tells the name of the player and the card pulled from the deck
	public void describe(Deck deckOfCards)  {
	Card newCard =	deckOfCards.draw();
	  System.out.println(getName() + " pulled the " + newCard.describe());
	  System.out.println();
	}
	
	//Player flips card here and the card is removed from the deck
	public Card flip() {
		return hand.remove(0);
	}
	
	//Deals the cards to each player to create each players hand.
	public Card draw(Deck deckOfCards) {
	return deckOfCards.draw();	
	}
	
	//Increments by one the score/total points.
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	
	//Gets the name of the player
	public String getName() {
		return name;
	}
	//Sets the name of the player
	public void setName(String name) {
		this.name = name;
	}
	//Gets the score of each player
	public int getScore() {
		return score;
	}
	//Sets the score of each player.
	public void setScore(int score) {
		this.score = score;
	}
	//Creates the players hand
	public List<Card> setPlayerHand(Card newCard){
		 hand.add(newCard);
	return hand;
	}
	//Retrieves the players hand after created
	public List<Card> getPlayerHand(){
	return this.hand;
	}
	
	//Method to compare strings
	public int compareValue1(String value1, String value2) {	
		return value1.compareTo(value2);		
	}
	//Method to compare strings
	public int compareValue2(String value1, String value2) {	
		return value2.compareTo(value1);		
	}
	//Method to see if cards are equal
	public boolean isEqual(String value1, String value2) {	
		return value1.equals(value2);		
	}

	public int getRound() {
		return round;
	}
	public int setRound(int round) {
		return this.round= round;
	}

	public int incrementRound() {
		return setRound(getRound() + 1);
	}
	
}
