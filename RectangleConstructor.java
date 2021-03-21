
public class RectangleConstructor {
	
	private int height;
	private int width;

	public RectangleConstructor(int height, int width) { // Constructor for the rectangle
		this.height = height; 
		this.width = width;
	}
	
	public void PrintPattern() { // Creates the rectangle with inputed width and height
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {				
				System.out.print("#");
				
				if(j == Math.round(width/2)) {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			
			if(i == Math.round(height/2)) {
				System.out.println("");
			}
			
		}
	}
	
	
	
	public void PrintRectangle() { // Prints the rectangle
		PrintPattern();
    }
	
	
} // End of class


