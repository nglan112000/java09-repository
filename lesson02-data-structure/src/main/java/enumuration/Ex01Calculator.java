package enumuration;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		System.out.println(operate(a, b, Operator.DIV));
	}

	// operator
	private static int operate(int a, int b, Operator operator) {
		int result = 0;
		switch (operator) {
		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MUL:
			result = a * b;
			break;
		case DIV:
			result = a / b;
			break;
		}
		return result;
	}
}
