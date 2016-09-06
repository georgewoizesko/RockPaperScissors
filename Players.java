package com.rockpaperscissors;

public abstract class Players {

	protected int choice = 0;
	protected int numofThrows = 0;
	
		
	public Players() {
	}

	public Players(int choice, int numofThrows) {
		this.choice = choice;
		this.numofThrows = numofThrows;
	}

	public abstract void move();
	
	public abstract void takeATurn();
}
