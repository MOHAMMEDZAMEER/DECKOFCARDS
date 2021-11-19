package com.DeckofCard;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String players[][] = new String[9][9];
		Cards obj = new Cards();
		
		obj.displayDeck();
		obj.assortRandom(players);
		obj.display(players);
		

	}}


