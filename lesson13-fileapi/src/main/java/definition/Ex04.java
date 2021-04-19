package definition;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import util.FileUtils;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] extensions = { ".txt", ".json", ".xml", ".pdf" };
		for (int i = 0; i < 10; i++) {
			String path = "filefilter" + File.separator + i + extensions[rd.nextInt(extensions.length)];
			File file = FileUtils.createFile(path);
			System.out.println(file.getPath());
		}

		// file filter
		System.out.println("===");
		File file = new File("filefilter");
		File[] xmlFiles = file.listFiles(subFile -> subFile.isFile() && subFile.getName().endsWith(".xml"));

		Arrays.stream(xmlFiles).forEach(System.out::println);
	}
}