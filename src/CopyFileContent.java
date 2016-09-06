
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFileContent {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt", true);
			// ^Boolean false deletes contents of file.
			//          true keeps contents (so you'll add onto it)
			
			int c;
			while ((c = in.read()) != -1) {
				
				// Next line just for us to see on the console.
				System.out.println(c);
				out.write(c);
			}
		}
		finally {
			if (in != null) {
				in.close();
				
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
