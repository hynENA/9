
public class RegularPolygon {
	
	/** 多边形变数n */
	private int n = 3;
	
	/** 多边形的边长side */
	private double side = 1;
	
	/** 多边形的坐标，（x,y） */
	private double x = 0;
	private double y = 0;
	
	/** 创建带默认值的多边形*/
	public RegularPolygon() {
		
	}
	
	/** 创建带制定边数和边长度的中心在（0,0）的正多边形*/
	public RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
	}
	
	/** 创建带指定边数，边长度，中心在（x,y）的正多边形*/
	public RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	/** 自定义多边形边数 */
	public void setN(int newN) {
		n = newN;
	}
	
	/** 自定义多边形边长 */
	public void setSide(double newSide){
		side = newSide;
	}
	
	/** 自定义多边形坐标 */
	public void setPosition(double newX,double newY) {
		x = newX;
		y = newY;
	}
	
	/** 返回多边形周长 */
	public double getPerimeter() {
		return n * side;
	}
	
	/** 返回多边形面积*/
	public double getArea() {
		return n * side * side * Math.cos(3.1415926 / n) / Math.sin(3.1415926 / n ) / 4;
	}
	
	/** 访问多边形边数  */
	public int getN() {
		return n;
	}
	
	/** 访问多边形边长 */
	public double getSide() {
		return side;
	}
	/** 访问多边形坐标 */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
