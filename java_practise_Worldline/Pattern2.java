/* 
enter the number: 3
      *  
   *  *  *
*  *  *  *  *
   *  *  *
      *        
      */

import java.util.Scanner;
class Pattern2{
    public static void main(String []args){
        Scanner n1=new Scanner(System.in);
        System.out.print("enter the number: ");
        int number =n1.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=number;j>i;j--){
                System.out.print("   ");
            }
             for(int k=1;k<=i;k++){
                System.out.print("*  ");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
        for(int i=1;i<=number;i++){
            for(int m=0;m<i;m++){
                System.out.print("   ");
            }
            for(int n=number;n>i;n--){
                System.out.print("*  ");
            }
             for(int l=number-1;l>i;l--){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}