package enummuration;

public class Ex01Calcualtor {

	public static void main(String[] args) {
		int a =10;
		int b =5;
		//0perate
		int result = Operate(a, b, Operator.DIV);
		System.out.println(result);
	}
	private static int Operate(int a, int b, Operator O) {
		int result = 0;
		switch (O) {
		case PLUS:
		result=a+b;
		break;
		case MINUS:
		result=a-b;
		break;
		
		case MUL:
			result=a*b;
			break;
		
		case DIV:
			result=a/b;
			break;
		}
		return result;

}
}
