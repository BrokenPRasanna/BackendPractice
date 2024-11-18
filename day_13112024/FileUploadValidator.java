package day_13112024;

import java.util.regex.Pattern;

public class FileUploadValidator {
	public static void main(String[] args) {
		String[] files = { "report.jpg", "patient.png", "data.pdf", "image.jpeg" };

		for (String file : files) {
			if (isImageFile(file)) {
				System.out.println(file + " is a valid image file.");
			} else {
				System.out.println(file + " is not a valid image file.");
			}
		}
	}

	public static boolean isImageFile(String fileName) {
		String regex = ".*\\.(jpg|jpeg|png|gif|bmp)$";
		return Pattern.matches(regex, fileName.toLowerCase());
	}
}
