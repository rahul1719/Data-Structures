import java.util.Scanner;

public class Fibonacci2 {

	int first = 0;
	int sec = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int series = scan.nextInt();
		Fibonacci2 fib = new Fibonacci2();
		fib.getFibSeries(series);

	}

	private void getFibSeries(int series) {
		int fib = 0;
		int[] fibarray = new int[series + 1];
		fibarray[0] = 0;
		fibarray[1] = 1;
		for (int i = 2; i <= series; i++) {

			fibarray[i] = fibarray[i - 2] + fibarray[i - 1];

		}
		for (int i = 0; i < series; i++) {
			System.out.print(fibarray[i]+" ");
		}

	}

}
