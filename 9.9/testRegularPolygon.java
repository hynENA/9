import java.util.Scanner;
public class testRegularPolygon {

	public static void main(String[] args) {
		
		RegularPolygon myPolygon = new RegularPolygon();
		
		/** �޲������� */
		System.out.println("�޲�������");
		System.out.println("�ܳ�Ϊ" + myPolygon.getPerimeter() + "\t���Ϊ" + myPolygon.getArea());
		
		/** RegularPolygon(6,4) */
		RegularPolygon newPolygon = new RegularPolygon(6, 4.0);
		System.out.println("RegularPolygon(6,4)");
		System.out.println("�ܳ�Ϊ" + newPolygon.getPerimeter() + "\t���Ϊ" + newPolygon.getArea());
		
		/** RegularPolygon(10,4,5.6,7.8) */
		RegularPolygon Polygon = new RegularPolygon(10, 4.0, 5.6, 7.8);
		System.out.println("RegularPolygon(10,4,5.6,7.8)");
		System.out.println("�ܳ�Ϊ" + Polygon.getPerimeter() + "\t���Ϊ" + Polygon.getArea());
		
	}

}
