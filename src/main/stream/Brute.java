package main.stream;

import lib.princeton.In;
import lib.princeton.StdDraw;


public class Brute {

	private static boolean ñollinearity(Point a,Point b,Point c)
	{
		if (((a.getX()-c.getX())*(b.getY()-c.getY()))-((b.getX()-c.getX())*(a.getY()-c.getY()))==0) return true;
		return false;
	}
	
	public static boolean ñollinearity(Point p,Point q,Point r,Point s)
	{
		return ñollinearity(p,q,r)&&ñollinearity(q,r,s);
	}
	
	
	
}
