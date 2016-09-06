package com.rockpaperscissors;

public class Human extends Players {
	
	public Human(int choice, int numofThrows) {
		super(choice, numofThrows);
		// TODO Auto-generated constructor stub
	}
	protected String name = null;
	protected String gender = null;
	
	
	public Human() {
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void takeATurn() {
		// TODO Auto-generated method stub
		
	}

}
