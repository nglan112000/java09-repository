package datatype;

public class Ex02PrimitiveTypeExe {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = b;
		b = a;
		
		//modified(a,b);//tham tri , co nghia la chi truyen gia tri
		swap(a,b);
		
		System.out.println("a : " + a);
		System.out.println("a : " + b);
	}
	private static void swap(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	
	private static void modified(int a,int b) {
		b = 30;
		a = b;
	}
}
