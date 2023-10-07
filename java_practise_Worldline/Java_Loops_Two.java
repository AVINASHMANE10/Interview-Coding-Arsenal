import java.util.*;
import java.io.*;
public class Java_Loops_Two {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        //  int t=in.nextInt();
        //  for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                int x=2,y=1;
                int result;
                for(int k=0;k<j;k++){
                        y=x*x;
                }
                
                result=a+y*b;
               
               System.out.print(result+" ");
            }
        //  }
        in.close();
    }
}
