package fileIO;

import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class LetterCountTest {

    @Rule
    private LetterCount letterCount;
    
    @Before
    public final void before() {
    	System.out.println("Initializing...");
        letterCount = new LetterCount();
    }
	
	@Test
	public void test1() {
		System.out.println("Starting test1()...");
		ByteArrayInputStream userInput = new ByteArrayInputStream("My string".getBytes());
		System.out.println("ByteArrayInputStream set up...");
		System.setIn(userInput);
		char l = 'x';
	}
	
}
