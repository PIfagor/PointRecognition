package main.stream;

import lib.princeton.In;
import lib.princeton.StdDraw;

public class Tester {


	 private static final String testFile = "data/input400.txt";
	 private static final String testFile2 = "data/rs1423.txt";
	private static final String testFile3 = "data/grid6x6.txt";
	    public static void main(String[] args) throws InterruptedException {
	        In in = new In(testFile2);
	        StdDraw.setXscale(0, 32768);
	        StdDraw.setYscale(0, 32768);
	        int N = in.readInt();
	        Point [] board = new Point [N];
	        for (int i = 0; i < board.length; i++) {
	        	board[i] = new Point(in.readInt(),in.readInt());
			}
	        for (int i = 0; i < board.length; i++) {
	        	//Thread.sleep(1000);
				board[i].draw();
			}
	        for (int i = 0; i < board.length; i++)
	        	for (int j = i+1; j < board.length; j++)
	        		for (int k = j+1; k < board.length; k++)
	        			for (int l = k+1; l < board.length; l++)
				if(Brute.ñollinearity(board[i],board[j],board[k],board[l]))
				{
					//Thread.sleep(1000);
					board[i].drawTo(board[j]);
					//Thread.sleep(1000);
					board[j].drawTo(board[k]);
					//Thread.sleep(1000);
					board[k].drawTo(board[l]);
				
			}
	}

}
