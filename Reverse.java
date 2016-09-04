import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		Reverse rev = new Reverse();
		String reverseNumber=rev.reverse(number);
		System.out.println(reverseNumber);

	}

	  String reverse(String number) {
		char[] revString=number.toCharArray();
		String str="";
		for(int i=revString.length-1;i>=0;i--){
			str=str.concat(Character.toString(revString[i])) ;
			
		}
		return str;
	}

}
