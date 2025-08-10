package creating_file_programs;

import java.io.File;
import java.io.IOException;

public class Doc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File c =new File("ha.doc");
		try {
			boolean b=c.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
			System.out.println("handls");
		}
		
	}

}
