package day_23102024;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HealthcareFileManager {

	public void writeFile(String fileName, String content) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		writer.write(content);
		writer.close();
		System.out.println("File written: " + fileName);
	}

	public void readFile(String fileName) throws IOException {
		File file = new File(fileName);
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		reader.close();
	}

	public void deleteFile(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("File deleted: " + fileName);
		} else {
			System.out.println("Failed to delete file: " + fileName);
		}
	}
}
