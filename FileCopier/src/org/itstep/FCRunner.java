package org.itstep;

public class FCRunner {
	public static void main(String[] args) {
//		String fromPath ="C:\\test\\cats.jpg";
//		String toPath ="F:\\test2\\cats.jpg";
//		FileIO fileIO = new FileIO();i
//		fileIO.copyFile(fromPath,toPath);
//		System.out.println("File copied!");
		
		String fromPath2 ="C:\\test\\text1.txt";
		String toPath2 ="F:\\test2\\text.txt";
		FileIO.copyTextFile(fromPath2, toPath2);
		System.out.println("File copied!");
	}

}
