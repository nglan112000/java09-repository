package polymorphism.object;

public class Square extends Shape {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println(getClass().getSimpleName() + "==> draw");
	}
}

