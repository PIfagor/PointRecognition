package main.stream;

import lib.princeton.In;
import lib.princeton.StdDraw;

public class Tester {


	 private static final String testFile = "data/input400.txt";
	 private static final String testFile2 = "data/rs1423.txt";
	private static final String testFile3 = "data/grid6x6.txt";
	    public static void main(String[] args) throws InterruptedException {
	        In in = new In(testFile);
	        In in2 = new In(testFile);
	        StdDraw.setXscale(0, 32768);
	        StdDraw.setYscale(0, 32768);
	        Brute b = new Brute(in);
	        Fast f = new Fast(in2);
	        
	        //b.runBrute();
	        f.runFast();
	}

}
