package fileIO;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		//Scanner inConsole = new Scanner(System.in);
		//char letter = inConsole.next().charAt(0);
		System.out.println("Please enter a single letter:");
		char letter = (char) System.in.read();
		int otherCase = 0;
		
		if (letter < 91 && letter > 64) 
			otherCase = letter + 32;
		
		else if (letter > 96 && letter < 123)
			otherCase = letter - 32;
		
		//System.out.println(letter);
		
		int count = 0;
		
		try {
			in = new FileInputStream("Xanadu");
		
			int charCode;
			
			while ((charCode = in.read()) != -1) {
				// Check to see if it's equal to the character
				if (charCode == letter || charCode == otherCase) {
					count++;
				}
			}
		}
		finally {
			if (in != null)
				in.close();
		}
		if (count == 1) {
			System.out.println("There is 1 \"" + letter + "\" in Xanadu.");
		}
		else {
			System.out.println("There are " + count + " \"" + letter + "\"'s in Xanadu.");
		}
	
	}

}