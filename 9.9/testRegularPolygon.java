import java.util.Scanner;
public class testRegularPolygon {

	public static void main(String[] args) {
		
		RegularPolygon myPolygon = new RegularPolygon();
		
		/** 无参数构造 */
		System.out.println("无参数构造");
		System.out.println("周长为" + myPolygon.getPerimeter() + "\t面积为" + myPolygon.getArea());
		
		/** RegularPolygon(6,4) */
		RegularPolygon newPolygon = new RegularPolygon(6, 4.0);
		System.out.println("RegularPolygon(6,4)");
		System.out.println("周长为" + newPolygon.getPerimeter() + "\t面积为" + newPolygon.getArea());
		
		/** RegularPolygon(10,4,5.6,7.8) */
		RegularPolygon Polygon = new RegularPolygon(10, 4.0, 5.6, 7.8);
		System.out.println("RegularPolygon(10,4,5.6,7.8)");
		System.out.println("周长为" + Polygon.getPerimeter() + "\t面积为" + Polygon.getArea());
		
	}

}
