import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Enter an integer: ");
		
		num = input.nextInt();
		
		if (num % 2 == 0)
			System.out.println(num + " is even.");
		else
			System.out.println(num + " is odd.");
		
		input.close();
	}
}
