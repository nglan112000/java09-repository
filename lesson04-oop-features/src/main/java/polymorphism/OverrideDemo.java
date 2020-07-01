package polymorphism;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.playSport();
		System.out.println("=======================");
		Child son = new Child();
		son.playSport();
		System.out.println("=======================");
		Parent undifined = new Child();
		System.out.println("runtime instance" + undifined.getClass());
		undifined.playSport();

	}

}
