import java.util.Scanner;              
public class MultiTable_Mock {         
    public static void main(String [] args){                                      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number=sc.nextInt();
        
               for (int i = 1 ;i<=number;i++){
                for(int j=1;j<=number;j++){
                    int answer=i*j;
                    int count=0;
                    for(int k=answer;k>0;k/=10){
                        count++;
                    }
                    if(count==1){
                        System.out.print("     "+(answer));
                    }
                    else{
                        System.out.print("    "+(answer));
                    }
                  
                }
                System.out.println("");
               }
               sc.close();

    }
    
}
 /*Enter The Number: 5
 output=
        1   2   3   4   5
        2   4   6   8  10
        3   6   9  12  15
        4   8  12  16  20
        5  10  15  20  25
Enter The Number: 3         
 output=                         
     1 2 3                              
     2 4 6                              
     3 6 9 */