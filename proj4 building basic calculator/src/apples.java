import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		Scanner buckky = new Scanner(System.in);
		double fnum, snum, answer;
		
		System.out.println("enter first num: ");
		fnum = buckky.nextDouble();
		
		System.out.println("enter second num: ");
		snum = buckky.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
	}
}
