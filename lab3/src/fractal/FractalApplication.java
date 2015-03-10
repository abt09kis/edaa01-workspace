package fractal;

import mountain.Mountain;
import koch.Koch;
import mountain.Point;

public class FractalApplication {
	public static void main(String[] args) {
		Fractal[] fractals = new Fractal[2];
		fractals[0] = new Koch(300);
		fractals[1] = new Mountain(new Point(70,450), new Point(260,90), new Point(550,500), 40);
	    new FractalView(fractals, "Fraktaler");
	}

}
