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
	private int PYRAMID_HEIGHT = (BRICKS_IN_BASE) * BRICK_HEIGHT;
	private GPoint BASE_ORIGIN = new GPoint((getWidth() / 2), getHeight() - BRICK_HEIGHT);
	//easiest to backtrack from here then making the bricks as you move to the end.
	
	public void run()
	{ 
		createPyramid();
	}
	
	
	private void createPyramid()
	{
		int totalBricks = 0;
		int tmpBricks = BRICKS_IN_BASE;
		
		while (tmpBricks > 0) { 
			totalBricks += tmpBricks;
			tmpBricks -= 1;
			println("tmpBricks = " + tmpBricks);
			println("totalBricks = " + totalBricks);
		}
		
		
		for (int i = 0; i < PYRAMID_HEIGHT; i++) {
			
		}
		
		
		
		
		
		
		while (totalBricks > 0) {
			//backtrack from BASE_ORIGIN to bricks in base / 2 (-x)
			
			GPoint newBrickOrigin = new GPoint(BASE_ORIGIN.getX() - 2,3);
			//make a GRect @ backtrackedPoint (x,y) at size (brick width, brick height)
			GRect newBrick = new GRect(
					newBrickOrigin.getX(),
					newBrickOrigin.getY(), 
					BRICK_WIDTH, 
					BRICK_HEIGHT		
			);
			totalBricks--;
		}
		
			
	}
}