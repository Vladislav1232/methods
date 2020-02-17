import java.util.Scanner;

public class wooord {

	

		public static void main(String[] args) {
			countWords (10);
		}
			public static void countWords (int length ) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите текст: ");
		String input = sc.nextLine();
		int count = 0;
		if (input.length() != 0) {
			count++;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ' ') {
					count++;
				}
			}
		}
		System.out.println("Количество слов - " + count);
	}
}
