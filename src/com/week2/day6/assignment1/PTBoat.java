package com.week2.day6.assignment1;

public class PTBoat
{
	String row;
	int column;

	private PTBoat()
	{
	}

	public PTBoat(String row, int column)
	{
		this.row = row;
		this.column = column;
	}

	public boolean isHit(String row, int column)
	{
		return row.equalsIgnoreCase(this.row) && column == this.column ? true : false;
	}
}
