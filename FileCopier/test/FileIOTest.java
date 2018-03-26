import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.itstep.FileIO;
import org.junit.jupiter.api.Test;

class FileIOTest {

	@Test
	
		public void testCopyFile() {

			String fromPath = "C:\\test\\cats.jpg";
			String toPath = "F:\\test2\\cats.jpg";

			FileIO fileIO = new FileIO();
			fileIO.copyFile(fromPath, toPath);
			
			byte[]bytes = fileIO.readDataFromFile(toPath);// date from picturs , photo
			assertTrue(bytes.length > 0);//

			File file = new File(toPath);// in the end 
			file.delete();// clean system after me
		}

		@Test
		public void testCopyTextFile() {
			String fromPath2 ="C:\\test\\text1.txt";
			String toPath2 ="F:\\test2\\text2.txt";
			
			FileIO fileIO = new FileIO();
			fileIO.copyFile(fromPath2, toPath2);
			
			String text= fileIO.readTextFromFile(fromPath2); 
			assertTrue("text text".contains(text));
			
			File file = new File(toPath2);
			file.delete();
		}

	}

