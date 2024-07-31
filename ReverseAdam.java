import java.util.Scanner;

public class ReverseAdam {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static boolean  isRevAdam(int n){
        int re=reverse(n);
        int sq=re*re;
        int sqre=reverse(sq);
        int squ=n*n;
        if(squ==sqre){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isRevAdam(n)){
            System.out.println("is a reverse adam number ");
        }
        else{
            System.out.println("is not a reverse adam number ");
        }

    }
}
