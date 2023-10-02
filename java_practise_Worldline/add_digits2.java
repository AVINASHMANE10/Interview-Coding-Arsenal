import java.util.Scanner;
public class add_digits2 {
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long number=x.nextLong();
        long sum=0;
        long rem=0;
        for(long i=number;i>0;i/=10){
            rem=i%10;
            sum=sum+rem;
        }
        System.out.println("temp sum: "+sum);
    }
}
