package datatype;

public class Ex04ObjectTypeEx {
	public static void main(String[] args) {
		Integer a=10; 
		Integer b=20;
		System.out.println("a code:"+System.identityHashCode(a));
		System.out.println("b code:"+System.identityHashCode(b));
		modified(a);
		System.out.println("a code:"+a+", b code:"+b);
	}
private static void swap (Integer a, Integer b) {
	a=a+b;
	b=a-b;
	a=a-b;
}

private static void modified (Integer a) {
	System.out.println("a method code 01:"+System.identityHashCode(a));
	a=30;
	System.out.println("a method code 02:"+System.identityHashCode(a));
}

}

