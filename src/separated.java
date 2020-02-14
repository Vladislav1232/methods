import java.util.Scanner;
import java.util.Arrays;

public class separated {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Введите длину массива: ");
		int mas = a.nextInt();
		int b[] = new int[mas];
		System.out.print("Теперь нужно его заполнить: ");
		int i = 0;
		while (i < b.length) {
			b[i] = a.nextInt();
			i++;
		}
		int max = b[0];
		for (int j = 1; j < b.length; j++) {
			if (b[j] > max)
				max = b[j];
		}
		System.out.println("Наибольший элемент: " + max);
	}
}
