import java.util.ArrayList;

public class Table {

		private int height;
		private int width;

		public Table(int height, int width) { // Constructor for the table
			this.height = height; 
			this.width = width;
		}
		
		
		
		public void getNumbers() {
			
			ArrayList<Integer> array = new ArrayList<Integer>(width * height); 
			for(int a = 1; a <= width * height; a++) { //puts values from 1 to width * height in an array to display in the table
				array.add(a);
			}
			
			int count = 0;
			for(int i = 1; i <= height; i++) { // a nested loop to show the values in the table format
				for(int j = 1; j <= width; j++) {
					if(count < 9) { // checks if the value is a single digit number
						if(j > 0 && j < width) { // checks if it is not the edge segment of a column
							System.out.print("|   " + array.get(count) + "   ");
							count++;
						}
						else { // output for the edge segment of the table
							System.out.print("|   " + array.get(count) + "   |");
							count++;
						}
					}
					
					else if(count >= 9 && count < 99) { // checks if the value is a double digit number
						
						if(j > 0 && j < width) { // checks if it is not the edge segment of a column
							System.out.print("|   " + array.get(count) + "  ");
							count++;
						}
						else { // checks if it is not the edge segment of a column
							System.out.print("|   " + array.get(count) + "  |");
							count++;
						}
					}
					
					else { // checks if the value is a triple digit number
						if(j > 0 && j < width) { // checks if it is not the edge segment of a column
							System.out.print("|   " + array.get(count) + " ");
							count++;
						}
						else { // checks if it is not the edge segment of a column
							System.out.print("|   " + array.get(count) + " |");
							count++;
						}
					}
					
				}
				System.out.println(""); // jumps to a new row
			}
			
		}
		
}
