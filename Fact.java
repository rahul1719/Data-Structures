import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		getFact(number);

	}

	private static void getFact(int number) {
		int fact = 1;
		if (number == 0 || number == 1) {
			System.out.println(1);
		} else {
			for (int i = number; i > 0; i--) {
				fact *= i;
			}
			System.out.println(fact);
		}

	}

}
