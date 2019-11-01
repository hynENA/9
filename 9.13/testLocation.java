import java.util.Scanner;
public class testLocation {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows in the array:");
		int row = input.nextInt();
		System.out.println("Enter the number of columns in the array:");
		int column = input.nextInt();
		
		double[][] array = new double[row][column];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[1].length; j++){
				System.out.println("Enter the value of array(" + i + ", " + j);
				array[i][j] = input.nextDouble();
				}
		}
		input.close();
		Location resultLocation = locateLargest(array);
		System.out.println("The location of the largest element is " + resultLocation.maxValue +
							" at (" + resultLocation.row + ", " + resultLocation.column + ")");
		
	}
	
 
	public static Location locateLargest(double[][] a){
		Location location = new Location();
		location.maxValue = a[0][0];
		location.row = 0;
		location.column = 0;
		for(int row = 0; row < a.length; row++){
			for(int column = 0; column < a[1].length; column++){
				if(location.maxValue < a[row][column])
				{
					location.maxValue = a[row][column];
					location.row = row;
					location.column = column;
				}
			}
		}
		return location;
	}
	
}