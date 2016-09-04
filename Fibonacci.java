import java.util.Scanner;

public class Fibonacci {

	int first = 0;
	int sec = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int series = scan.nextInt();
		Fibonacci fib = new Fibonacci();
		for (int i = 1; i <= series; i++) {
			System.out.print(fib.getFibSeries(i) + " ");
		}

	}

	private int getFibSeries(int series) {
		int fib = 0;

		if (series == 1) {
			fib = 0;
			return fib;
		} else if (series == 2) {
			fib = 1;
			return fib;
		} else {
			fib = getFibSeries(series - 2) + getFibSeries(series - 1);
		}
		return fib;

	}

}
