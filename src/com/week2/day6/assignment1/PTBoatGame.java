package com.week2.day6.assignment1;

public class PTBoatGame
{

	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats = 0;
	private int numberOfHits = 0;
	private int numberOfMisses = 0;

	public PTBoatGame() 
	{
	}

	public int getNumberOfGuesses()
	{
		return numberOfHits + numberOfMisses;
	}
	
	public void addBoat(String row, int column)
	{
	    // Add a new boat to the ptBoats array

	    // You will need to use the numberOfBoats
	    // value to tell you what element of the
	    // array to initialize

		ptBoats[numberOfBoats] = new PTBoat(row, column);
		
	    // remember to increment the numberOfBoats 
	    // before you leave
		
		numberOfBoats++;
	}

	public boolean guess(String row, int column)
	{
	    // Check to see if the guess hit any of the ships.
	    // Return true only if a ship was hit
		
		for(int i = 0; i < numberOfBoats; i++)
		{
			if (ptBoats[i].isHit(row, column))
			{
				numberOfHits++;
				System.out.println("Guess " + getNumberOfGuesses() + " at row " + row + ", column " + column + " hit a PTBoat");
				return true;
			}
		}
		numberOfMisses++;
		System.out.println("Guess " + getNumberOfGuesses() + " Missed");
		return false;
	} 
	
	public void printFinalResults()
	{
		System.out.println("\nTotal hits: " + numberOfHits + "\nTotal Misses: " + numberOfMisses + "\nTotal Guesses: " + getNumberOfGuesses());
	}

	public static void main(String[] args)
	{
	    // Create a PTBoatGame instance

		PTBoatGame newGame = new PTBoatGame();
		
	    // Add 6 PTBoats

		newGame.addBoat("A", 12);
		newGame.addBoat("C", 1);
		newGame.addBoat("E", 4);
		newGame.addBoat("F", 7);
		newGame.addBoat("B", 9);
		newGame.addBoat("D", 10);
		
	    // Take six guesses and output the following string for each
	    // If the guess hit a pt boat...
	    // Guess number # at row <row>, column <column> hit a PTBoat

	    // If the guess missed all boats
	    // Guess number # missed
		
		newGame.guess("A", 30);
		newGame.guess("C", 1);
		newGame.guess("A", 12);
		newGame.guess("D", 10);
		newGame.guess("B", 9);
		newGame.guess("M", 95);
		
		newGame.printFinalResults();

	}
}
