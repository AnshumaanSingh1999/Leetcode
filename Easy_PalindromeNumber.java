public class Easy_PalindromeNumber {
    public static boolean ispallindrome(int a){
        boolean x;
        int r=0;
        int temp=a;
        while(a!=0){
            int d=a%10;
            r=r*10+d;
            a=a/10;
        }
        if(r==temp){
            x=true;
        }
        else{
            x=false;
        }   
        return(x);
    }   
    public static void main(String args[]){
        int n=121;
        int m=100;
        boolean x=ispallindrome(n);
        System.out.println(x);
    }
}
