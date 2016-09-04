import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int counter = number - 1;
		System.out.println(checkIfPrime(number, counter));
		;

	}

	private static boolean checkIfPrime(int number, int counter) {

		if (counter == 1) {
			return true;
		} else if (number % counter == 0) {
			return false;

		}
		counter--;
		return checkIfPrime(number, counter);
	}

}
