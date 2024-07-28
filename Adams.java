import java.util.*;
public class Adams {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static boolean isAdam(int n){
        int revNum=reverse(n);
        int nsq=n*n;
        int revsq=revNum*revNum;
        int r=reverse(revsq);
        if(nsq==r){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isAdam(n)){
            System.out.println("is a adam number ");
        }
        else{
            System.out.println("is not a adam number ");
        }

    }
}
