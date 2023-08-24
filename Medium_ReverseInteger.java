import java.util.*;
public class Medium_ReverseInteger {
    static void reverse(int n){
        int d=0;
        int r=0;
        while(n!=0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }
}
