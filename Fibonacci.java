import java.util.Scanner;

public class Fibonacci {

	int first = 0;
	int sec = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int series = scan.nextInt();
		Fibonacci fib = new Fibonacci();
		
		int	fibValue=fib.getFibSeries(series);
		System.out.print(fibValue+" ");
		

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
			fib = getFibSeries(series - 1) + getFibSeries(series - 2);
			
		}
		
		return fib;

	}

}
