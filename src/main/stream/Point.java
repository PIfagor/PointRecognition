package main.stream;
import java.util.Comparator;

import lib.princeton.StdDraw;

public class Point implements Comparable<Point> {

	/** порівнює точки за нахилом */
	public final Comparator<Point> SLOPE_ORDER = new SOrder();

	/** X coordinate */
	private final int x;
	/** Y coordinate */
	private final int y;

	/** створюємо точку (x, y) */
	public Point(int x, int y) {
		/* DO NOT MODIFY */
		this.x = x;
		this.y = y;
	}

	/** // малюємо точку */
	public void draw() {
		/* DO NOT MODIFY */
		//StdDraw.setPenRadius(0.01);
		StdDraw.point(getX(), getY());
	}

	/** малюємо відрізок */
	public void drawTo(Point that) {
		/* DO NOT MODIFY */
		StdDraw.setPenRadius(0.01);
		StdDraw.line(this.getX(), this.getY(), that.getX(), that.getY());
	}

	/** нахил між цією і that точкою */
	public double slopeTo(Point that) {
		if(this == that) return Double.NEGATIVE_INFINITY;
		if (this.getX() ==  that.getX()) return Double.POSITIVE_INFINITY;
		if (this.getY() ==  that.getY()) return 0;
		return (double)((that.getY() - this.getY())/(that.getX() - this.getX()));
	}

	/** чи ця точка лексикографічно менша за that? */
	public int compareTo(Point that) {
		if (this.getY() == that.getY() && this.getX() == that.getX())
			return 0;
		else if (this.getY() == that.getY()) {
			if (this.getX() < that.getX())
				return -1;
			else
				return 1;
		} else {
			if (this.getY() < that.getY())
				return -1;
			else
				return 1;
		}
	}

	private  class SOrder implements Comparator<Point> {
		public int compare(Point p, Point q) {
			if (compareTo(p)<compareTo(q)) return -1;
			if (compareTo(p)>compareTo(q)) return 1;
			return 0;
		}
	}

	/** точка у вигляді String */
	public String toString() {
		/* DO NOT MODIFY */
		return "(" + getX() + ", " + getY() + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
