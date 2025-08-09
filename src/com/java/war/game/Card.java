package com.java.war.game;

public class Card {
    //Value of the card
	private int value;
	//Name of the card
	private String name;
	
	//Constructor to set the card
	public Card(String name, int value) {
		this.value = value;
		this.name = name;
	};
	
	//Gets the value of the card
	public int getValue() {
		return value;
	}
	//Sets the value of the card
	public void setValue(int value) {
		this.value = value;
	}
	//Gets the name of the card
	public String getName() {
		return name;
	}
	//Sets the name of the card
	public void setName(String name) {
		this.name = name;
	}
	//Gives a description of the card created.
	public String describe() {
		return (this.name + " " + String.valueOf(this.value));
	}
	
}
