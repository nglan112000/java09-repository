package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer c = 10;
		System.out.println("a code: " + System.identityHashCode(a));
		System.out.println("b code: " + System.identityHashCode(b));
		System.out.println("c code: " + System.identityHashCode(c));

//		modified(a);
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void modified(Integer a) {
		System.out.println("a method code: " + System.identityHashCode(a));
		a = 30;
		System.out.println("a method code: " + System.identityHashCode(a));

	}

	private static void swap(Integer a, Integer b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
}