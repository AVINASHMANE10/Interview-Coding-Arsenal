import java.util.Scanner;
public class add_digits 
{
    static long sum=0;
    public static int count_digi(long number){
        int count=0;
        for(long i=number;i>0;i/=10){
            count++;
        }
        return count;
    }
    public static long sum_of_digits(long number){
        int no_Of_Digits=count_digi(number);
        long rem=0;
        for(long i=number;i>0;i/=10){
            rem=i%10;
            // System.out.println("rem :"+rem);
            sum=sum+rem;
            // System.out.println("temp sum: "+sum);
        }
        //  for(int j=0;j<no_Of_Digits;j++){
                
        //     }
        return sum;

    }
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        // x.nextLine();
        long number=x.nextLong();
        System.out.println("final output: "+sum_of_digits(number));
    }
}
