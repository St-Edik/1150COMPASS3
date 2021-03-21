import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class wordGame2 {
	
	public static char randomChar;
	public static String input;
	public static char firstLetter;
	public static ArrayList<Integer> num;
	
	public static void main(String[] args) {
		
		do {
			
			wordCreator();
			
		}while(loopAgain().equals("Y"));
		
	}
	
	public static void wordCreator() {
		
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		Random rnd = new Random();
		char randomChar = (char) ('a' + rnd.nextInt(26)); // Chooses a random character as a starting letter
		System.out.println("Your word should start from letter: " + randomChar); // Prints the starting letter
		System.out.println("If letters in your word are in ascending order, your score will be tripled.");
		
		System.out.println("Enter your word: "); // Asks to enter a word
		input = scan.nextLine().toLowerCase(); // Scans the next input and stores it in a string variable
		char[] word = input.toCharArray();
		firstLetter = word[0];
		num = new ArrayList<Integer>();
		
		
		for (int i = 0; i < input.length(); i++){ // puts the characters converted to integers in the array
			
	        num.add(input.charAt(i) - '0');
	        
	    }
		
		for(int d : num) { // counts the user's score 
			
		    score += d;
		    
		}
		
			
		if(firstLetter == randomChar) { // checks if the user's word starts from a randomly generated character
				
			if(checkOrder()) { // output is letters are in ascending order
				System.out.println("The letters in your word are in ascending order, your score is: " + (score * 3));
			}
				
			else { // output is letters are not in ascending order
				System.out.println("Your score is: " + score);
			}
				
		}
	        
	    else { // output if the word did not start from the generated letter
			System.out.println("Your word should have started from " + randomChar);
		}	
		

	}
	
	public static boolean checkOrder() { //checks if the letters go in ascending order
		
		int i = 0;
	    boolean ascend = false; 
	    while(i < input.length() - 1){
	        if (input.charAt(i) <= input.charAt(i + 1))
	            ascend = true;
	        else{
	            ascend = false;
	            break;
	        }
	        i++;
	    }    
	    return ascend;
	
	}
	
	public static String loopAgain() { // allows to run the loop as many times as user wants
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Type Y to play again, type N to stop: ");
		String playAgain = scan2.next();
		
		return playAgain;
		
	}
	

}
