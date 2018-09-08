import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		tuna tunaobj = new tuna();    //classname(tuna) objname(tunaobj)
		
		System.out.println("enter ur name: ");
		
		String name = input.nextLine();   //store typed input in variable name
		tunaobj.simplemsgg(name);         //using obj and method: obj.methodname
		
		
	}
}
