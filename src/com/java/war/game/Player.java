package com.java.war.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Creates a list of cards.
	public List<Card> hand = new ArrayList<Card>();
	//To keep score
	private int score;
	//Player's name
	private String name;
	
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
	public void draw(Deck deckOfCards) {
	Card newCard =	deckOfCards.draw();
	hand.add(newCard);
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
 
 
}
