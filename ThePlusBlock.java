import java.util.Scanner;

public class ThePlusBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //scanner initiation
		
		System.out.println("Input the height of the rectangle: ");
		int height = scan.nextInt(); //height input
		
		System.out.println("Input the width of the rectangle: ");
		int width = scan.nextInt(); //width input
		
		RectangleConstructor s = new RectangleConstructor(height, width); 
		// calls a rectangle constructor with width and height equal to user's inputs
		s.PrintRectangle(); // prints the rectangle
		
		scan.close();
		
	}

}
