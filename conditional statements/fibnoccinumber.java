public class fibnoccinumber {

    public static int fib(int k){
        //base case 
        if (k==0 || k == 1) {
            return k;
        } 
        int n1=fib(k-1);
        int n2=fib(k-2);
        int fn=n1+n2;
        return fn;  
        
    }
    public static void main(String[] args) {
        int n=40;
        System.out.println(fib(n));

        // int x=0;  basic approach
        // int y=1;
        // for (int i = 1; i <= n; i++) {
        //    System.out.println(x+" ");
        //    int z=x+y;
        //     x=y;
        //     y=z;
        // }

    }
}
