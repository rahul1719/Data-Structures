import java.util.Scanner;

public class Fact2 {
	static int factValue = 1;
	static int fact = 1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println(getFact(number));

	}

	private static int getFact(int number) {

		if (number == 0 || number == 1) {
			return fact;
		} else {
			factValue = number;

		}
		fact *= factValue;
		getFact(number - 1);
		return fact;

	}

}
