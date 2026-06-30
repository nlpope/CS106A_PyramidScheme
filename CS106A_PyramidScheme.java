/**
 * File: CS106A_PyramidScheme.java
 * ----------------------------
 * This Java program creates a pyramid.
 */

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class CS106A_PyramidScheme extends GraphicsProgram
{	
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private int BRICKS_IN_BASE = 14;
	private GPoint BASE_ORIGIN = new GPoint((getWidth() / 2), getHeight());
	//easiest to backtrack from here then making the bricks as you move to the end.
	
	public void run()
	{ 
		createPyramid();
	}
	
	
	private void createPyramid()
	{
		int bricksInRow = BRICKS_IN_BASE;
		while (bricksInRow > 0) {
			for(int i = 0; i < bricksInRow; i--) {
				//backtrack from starting point to the length of bricks/2
			}
			bricksInRow--;
		}
		
		
		//acct for y getting smaller and smaller (moving up)
		GPoint iRowStartingPoint = BASE_ORIGIN.getLocation();
		
		//if num of bricks % 2 == 0, lay 2 bricks; else, lay 1 prick
		//for i=0; i <= (bricks in base / 2); i--{}
		//then backtrack to starting point
		//then for i = 0; i <= (bricks in base / 2); i++{}
		
		
		for (int i = 0; i < N_ROWS; i++) { //rows lie horizontal but move down (y changes here)
			for (int j = 0; j < N_COLUMNS; j++){ //columns lie vertically, but move across (x changes here)
				double x = j * sqSize;
				double y = i * sqSize;
				GRect square = new GRect(x, y, sqSize, sqSize);
				square.setColor(Color.PINK);
				square.setFilled((i + j) % 2 == 0);//careful here, account for x AND y before testing
				add(square);
			}
		}
	}
}