import java.util.*;
public class Medium_ReverseInteger {
    static int reverse(int n){
        int d=0;
        int r=0;
        while(n!=0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }else {
            return (int) r;
        }
        // System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=reverse(n);
        System.out.println(x);
    }
}
