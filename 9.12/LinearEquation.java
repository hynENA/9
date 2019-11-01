public class LinearEquation {
	final double EPSILON = 1E-14;
	private double a,b,c,d,e,f;
	LinearEquation(double newA, double newB, double newC,
					double newD, double newE, double newF){
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	public boolean isSolveable(){
		return Math.abs((a *d - b * c) - 0) >= EPSILON ? true : false;
	}
	public double getX(){
		return (e * d - b * f) / (a *d - b * c);
	}
	public double getY(){
		return (a * f - e * c) / (a *d - b * c);
	}
	
}