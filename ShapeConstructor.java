
public class ShapeConstructor {
	
	private int height;
	private int width;

	public ShapeConstructor(int height, int width) { // Constructor for the shape
		this.height = height; 
		this.width = width;
	}
	
	public void PrintPattern2() { 
		// Creates the rectangle with inputed width and height and circle in the middle
		for(int i = -height; i < height; i++) {
			for(int j = -width; j < width; j++) {				
				if(j * j + i * i <= height/2 * width/2) {
					if(i == 0 && j == 0) {
						System.out.print(" ");
					}
					else {
						System.out.print("O");
					}
					
				}
				
				else {
					System.out.print("#");
				}
				
			}
			System.out.println("");
		}
		
	}
	
	public void PrintShape() { // Prints the rectangle
		PrintPattern2();
    }

}
