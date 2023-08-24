public class Easy_TwoSum{
    public static int[] twoSum(int a[], int b){
        int n[]=new int[] {0,0};
        int s=0;
        int l=a.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                s=a[i]+a[j];
                if(s==b){
                    n= new int[] {i,j};   
                }
            }
        }
        return(n);
    }
    public static void main(String[] args) {
        System.out.println("Test");
        int a[]={1,2,3,4,5};
        int b=5;
        int c=4;
        int d=6;
        System.out.println(twoSum(a,b));
        
    }
}