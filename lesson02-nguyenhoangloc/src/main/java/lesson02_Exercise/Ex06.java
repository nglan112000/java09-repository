package lesson02_Exercise;

public class Ex06 {
	public static void main(String[] args) {

		int dem = 0;
		int i = 1;
		while (dem < 30) {
			if (ktsnt(i) == 1) {
				dem = dem + 1;
				i++;
			} else {
				i++;

			}

		}
		System.out.println(i - 1);

	}

	public static int ktsnt(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				dem++;
		}
		if (dem == 2)
			return 1;
		else
			return 0;
	}

}
