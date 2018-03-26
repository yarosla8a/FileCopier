package org.itstep;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileIO {
	public void writeDataToFile(String filePath, byte[] bytes) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
			fos.write(bytes);// 2
			fos.flush();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public byte[] readDataFromFile(String filePath) {
		byte[] bytes = null;

		File file = new File(filePath);
		try {
			bytes = Files.readAllBytes(file.toPath());
		} catch (IOException e) {

			e.printStackTrace();
		}

		return bytes;

	}

	public void copyFile(String fromPath, String toPath) {
		byte[] bytes = readDataFromFile(fromPath);
		writeDataToFile(toPath, bytes);

	}

	public static String readTextFromFile(String fromPath) {
		String text = "";

		FileReader reader = null;// null
		try {
			reader = new FileReader(fromPath);
			int oneByte = -1;
			while ((oneByte = reader.read()) != -1) {// ��������������� ������ �
														// �������� -1;
				text += String.valueOf((char) oneByte);// char in String;

			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return text;
	}

	public static void writeTextToFile(String text, String toPath) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(toPath);
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void copyTextFile(String fromPath, String toPath) {
		String text = readTextFromFile(fromPath);
		writeTextToFile(text, toPath);

	}

}
