import java.util.Scanner;

public class FizzBuzz_WorldLine_L2 {
    static String result;
	public static String fizzBuzz(int n)
	{
			if (n % 3 == 0 && n % 5 == 0) {
				result="FizzBuzz";
			}
			else if (n % 3 == 0) {	
				result="Fizz";
			}
		
			else if (n % 5 == 0) {	
				result="Buzz";
			}
			else {
				result=Integer.toString(n);
			}
		
		return result;
	}

	public static void main(String[] args)
	{   Scanner n1=new Scanner(System.in);
		System.out.println("enter first number");
        int x=n1.nextInt();
        System.out.println("enter Second number");
        int y=n1.nextInt();
        System.out.println("enter Third number");
        int z=n1.nextInt();
		System.out.println("x :"+fizzBuzz(x));
        System.out.println("y :"+fizzBuzz(y));
        System.out.println("z :"+fizzBuzz(z));
	}
}
