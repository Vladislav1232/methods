import java.util.Scanner;
public class mdeee {

	public static void main(String args[]) {
		int x, y;
		System.out.print("¬ведите высоту пр€моугольника: ");
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
		System.out.print("¬ведите ширину пр€моугольника: ");
		y = scn.nextInt();
		scn.close();
		for (int j = 0; j < y; j++) {
			System.out.print("x");
		}
		System.out.println();
		for (int i = 1; i < x - 1; i++) {
			for (int k = 0; k < y; k++) {
				if ((k == 0) || (k == y - 1)) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int j = 0; j < y; j++) {
			System.out.print("x");
		}
		System.out.println();
	}
}
