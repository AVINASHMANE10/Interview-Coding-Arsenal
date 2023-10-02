/* 
enter the number of stars: 4
 *  *  *  *
 *        *
 *        *
 *  *  *  *     */
import java.util.Scanner;
public class pattern1 {
    public static void main(String []args){
        Scanner n1=new Scanner(System.in);
        System.out.print("enter the number of stars: ");
        int number=n1.nextInt();
        int i;
         for (int s = 1 ;s<=number;s++){
            for( i=1;i<=number;i++){
                if((i==1 || i==number)||(s==1 || s==number))
                {
                System.out.print("*  ");
                }
                else{
                     System.out.print("   ");
                }
                   
            }
            System.out.println();
         }
    }
    
}
