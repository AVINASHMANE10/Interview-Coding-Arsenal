public class Recurssion_1 {
    public static int sum(int b,int n){
        if(n==1){
            System.out.println(n+" <n + b> "+b); 
            return b;
        }
        int s=sum(b,n-1);
        System.out.println(n+" <n + s> "+s);
        s=s+n-1;
        return s;
    }
    public static void main(String[] args){
        System.out.println(sum(2,1));
    }
    
}
