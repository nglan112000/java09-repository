package random;

import java.util.Random;

public class Ex02RandomPassword {
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		int count = 1;
		String[] passwords = new String[1000];
		final String password = "028";
		String textRand = "";
		do {
			Thread.sleep(5);
			// System.out.print(textRand + " ");
			textRand = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (contains(passwords, textRand, count)) {
				continue;

			}
			passwords[count++] = textRand;
			System.out.print(textRand + " ");
			if (count % 13 == 0) {
				System.out.println();
			}

		} while (!password.equals(textRand));
	}

	private static boolean contains(String[] passwords, String textRand, int count) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= count; i++) {
			if (textRand.equals(passwords[i])) {
				return true;
			}

		}
		return false;
	}

}
