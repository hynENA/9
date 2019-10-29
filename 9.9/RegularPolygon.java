
public class RegularPolygon {
	
	/** ����α���n */
	private int n = 3;
	
	/** ����εı߳�side */
	private double side = 1;
	
	/** ����ε����꣬��x,y�� */
	private double x = 0;
	private double y = 0;
	
	/** ������Ĭ��ֵ�Ķ����*/
	public RegularPolygon() {
		
	}
	
	/** �������ƶ������ͱ߳��ȵ������ڣ�0,0�����������*/
	public RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
	}
	
	/** ������ָ���������߳��ȣ������ڣ�x,y�����������*/
	public RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	/** �Զ������α��� */
	public void setN(int newN) {
		n = newN;
	}
	
	/** �Զ������α߳� */
	public void setSide(double newSide){
		side = newSide;
	}
	
	/** �Զ����������� */
	public void setPosition(double newX,double newY) {
		x = newX;
		y = newY;
	}
	
	/** ���ض�����ܳ� */
	public double getPerimeter() {
		return n * side;
	}
	
	/** ���ض�������*/
	public double getArea() {
		return n * side * side * Math.cos(3.1415926 / n) / Math.sin(3.1415926 / n ) / 4;
	}
	
	/** ���ʶ���α���  */
	public int getN() {
		return n;
	}
	
	/** ���ʶ���α߳� */
	public double getSide() {
		return side;
	}
	/** ���ʶ�������� */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
