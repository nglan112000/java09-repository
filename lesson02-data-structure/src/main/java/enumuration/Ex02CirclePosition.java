package enumuration;

public class Ex02CirclePosition {

	public static void main(String[] args) {
		//A(0, 4)
		//O(0, 0) R = 2;
		CirclePos pos = getPos(4, 4, 10);
		System.out.println("pos: " + pos.value);
	}
	
	private static CirclePos getPos(int xA, int yA, int R) {
		double distance = Math.sqrt(xA*xA + yA*yA);
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		if(distance == R) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.INSIDE;
		
	}
}
