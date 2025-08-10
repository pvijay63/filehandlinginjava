package creating_file_programs;

import java.io.File;
import java.io.IOException;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File s =new File("Helo.txt");
		 try {
			boolean n =s.createNewFile();
			System.out.println(n);
		} catch (IOException e) {
			System.out.println("handled");
		}
	}

}
