import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Prime prime = new Prime();
		System.out.println(prime.checkPrime(number));

	}

	private boolean checkPrime(int number) {
		boolean flag = true;
		if (number == 1) {
			return true;
		} else if (number > 1) {
			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					return false;
				}
			}
		}

		return flag;
	}

}
