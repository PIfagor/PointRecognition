package main.stream;

import lib.princeton.In;
import lib.princeton.StdDraw;


public class Brute {
	private  Point [] board ;
	public Brute(In in) {
		 int N = in.readInt();
	        board = new Point [N];
	        for (int i = 0; i < board.length; i++) {
	        	board[i] = new Point(in.readInt(),in.readInt());
			}
	       
	}
	
	
	private static boolean ñollinearity(Point a,Point b,Point c)
	{
		if (((a.getX()-c.getX())*(b.getY()-c.getY()))-((b.getX()-c.getX())*(a.getY()-c.getY()))==0) return true;
		return false;
	}
	
	public static boolean ñollinearity(Point p,Point q,Point r,Point s)
	{
		return ñollinearity(p,q,r)&&ñollinearity(q,r,s);
//		if (p.slopeTo(q)!=p.slopeTo(r)) return false;
//		if (p.slopeTo(r)!=p.slopeTo(s)) return false;
//		if (p.slopeTo(q)!=p.slopeTo(s)) return false;
//		return true;
	}
	
	public void runBrute() {
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
