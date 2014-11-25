package main.stream;

import java.util.Arrays;

import lib.princeton.In;
import lib.princeton.StdDraw;

public class Fast {
	private Point[] pts = null;

	public Fast(In in) {
		
		getPoints(in);
	}

	private Point[] getPoints(In in)  {
		
		//Scanner s = new Scanner(new File("input400.txt"));

		int N = in.readInt();

		 pts = new Point[N];

		for (int i = 0; i < N; ++i) {
			int x = in.readInt();
			int y = in.readInt();
			pts[i] = new Point(x, y);
		}

		return pts;
	}
	
	public void runFast() {
	
		
		for (int i = 0; i < pts.length; ++i) {
			StdDraw.point(pts[i].getX(), pts[i].getY());
		}
		
		for (int i = 0; i < pts.length; ++i) {
			Point pp = pts[i];
			Arrays.sort(pts, pp.SLOPE_ORDER);
			
			for (int j = 1; j < pts.length-2; ++j) {
				
				double g1 = pp.slopeTo(pts[j]);
				double g2 = pp.slopeTo(pts[j+1]);
				double g3 = pp.slopeTo(pts[j+2]);
				
				if (g1 == g2 && g1 == g3) {
					StdDraw.line(pp.getX(), pp.getY(), pts[j].getX(),pts[j].getY());
					StdDraw.line(pts[j].getX(),pts[j].getY(), pts[j+1].getX(),pts[j+1].getY());
					StdDraw.line(pts[j+1].getX(),pts[j+1].getY(), pts[j+2].getX(),pts[j+2].getY());
					
					int t = j+2;
					
					while (++t < pts.length && g3 == pp.slopeTo(pts[t])) {
						StdDraw.line(pts[t-1].getX(),pts[t-1].getY(), pts[t].getX(),pts[t].getY());
					}

					j = t-2;
				}
			}

		}
		
	}


}
