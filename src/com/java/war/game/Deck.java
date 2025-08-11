package com.java.war.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Creates a list of cards
	private List<Card> cards = new ArrayList<Card>();
	
	//Creates the deck of cards
	public Deck() {  
     String[] names = {"Hearts", "Diamonds", "Clubs", "Spades"};
     String[] values = {"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace"};
     
     for(String name : names ) {
    	 for(String value : values) {
        		 cards.add(new Card(name, value));
    	 }
     }    
	}
	
	//Shuffles the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//Each player draws a card from the deck creating a hand
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		}
		 return cards.remove(0);
	}
	
	//Gets list of cards.
	public List<Card> getCards() {
		return cards;
	}
}
