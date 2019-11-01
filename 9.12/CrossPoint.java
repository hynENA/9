import java.util.Scanner;
public class CrossPoint {
	/** main method */
	public static void main(String[] args){
		/** ªÒ»° ‰»Î */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1:");
		double x1 = input.nextDouble();
		System.out.println("Enter y1:");
		double y1 = input.nextDouble();
		System.out.println("Enter x2:");
		double x2 = input.nextDouble();
		System.out.println("Enter y2:");
		double y2 = input.nextDouble();
		System.out.println("Enter x3:");
		double x3 = input.nextDouble();
		System.out.println("Enter y3:");
		double y3 = input.nextDouble();
		System.out.println("Enter x4:");
		double x4 = input.nextDouble();
		System.out.println("Enter y4:");
		double y4 = input.nextDouble();
		input.close();
	
		LinearEquation linearEquation = new LinearEquation(y1 - y2, -(x1 - x2), y3 - y4, -(x3 - x4),
								   (y1 - y2) * x1 - (x1 - x2) * y1,
								   (y3 - y4) * x3 - (x3 - x4) * y3);
		
		if(linearEquation.isSolveable())
			System.out.println("cross point x is " + linearEquation.getX() + 
							   "cross point y is " + linearEquation.getY());
		else
			System.out.println("Have no cross point.");
	}
}