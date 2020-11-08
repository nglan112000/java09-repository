package immutable;

import java.util.Arrays;


public class Ex04 {
	// tim danh sach bai hat co duoi mp3
	public static void main(String[] args) {
		String[] music = { 
				"d:/music/howdolikethat.mp4", 
				"d:/music/stronger.mp3", 
				"d:/music/weakness.mp3",
				"d:/music/ahihi.mov",

		};
		String[] result = getMp3Songs(music);
		System.out.println(String.join(", ", result));
				

		// output :stronger.mp3",weakness.mp3",
	}

	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith("mp3")) {
				int lastSlashIndex = music.lastIndexOf("/");
				int lastDotIndex = music.lastIndexOf(".");
				result[index++] = music.substring(lastSlashIndex + 1, lastDotIndex);
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

}
