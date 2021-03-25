package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// mutable versus immutable
		String s1 = "java09";
		hash("s1", s1);
		s1 += " lesson08";
		hash("s1", s1);

		StringBuilder s2 = new StringBuilder("java90");
		hash("s1", s2);

		s2.append(" lesson80");
		hash("s1", s2);

	}

	private static void hash(String s, CharSequence input) {
		System.out.println(s + " : " + System.identityHashCode(input));
	}

}