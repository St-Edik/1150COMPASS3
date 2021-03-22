import java.util.Scanner;

public class TheCircleCenter {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in); //scanner initiation
		
		System.out.println("Input the height of the rectangle: ");
		int height = scan.nextInt(); //height input
		
		System.out.println("Input the width of the rectangle: ");
		int width = scan.nextInt(); //width input
		
		ShapeConstructor h = new ShapeConstructor(height, width);
		// calls a shape constructor with width and height equal to user's inputs
		h.PrintShape(); // prints the shape
				
		scan.close();

	}

}
