import java.util.Scanner;

public class OddOrEven {
	
	static String OddEven(int num){
		String flag;
		
		if (num % 2 == 0)
			flag = "even";
		else
			flag = "odd";	
		
		return flag;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		String result;
		
		System.out.println("Enter an integer: ");
		
		num = input.nextInt();
		
		result = OddEven(num);
		
		System.out.println(num + " is " + result + ".");
		
		input.close();
	}
}
