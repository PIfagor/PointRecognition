package main.stream;

import lib.princeton.In;
import lib.princeton.StdDraw;


public class Brute {

	private static boolean �ollinearity(Point a,Point b,Point c)
	{
		if (((a.getX()-c.getX())*(b.getY()-c.getY()))-((b.getX()-c.getX())*(a.getY()-c.getY()))==0) return true;
		return false;
	}
	
	public static boolean �ollinearity(Point p,Point q,Point r,Point s)
	{
		return �ollinearity(p,q,r)&&�ollinearity(q,r,s);
	}
	
	
	
}
