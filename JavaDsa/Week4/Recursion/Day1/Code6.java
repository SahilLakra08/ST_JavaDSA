package ST_JavaDSA.JavaDsa.Week4.Recursion;

public class Code6 {
    //Fibonaci Series
    //HEAD RECURSION
    static int fib(int n){
        if(n==0 || n==1)return n;
        return fib(n-1)+fib(n-2);
    }
    //TAIL RECURSION
    static int fibTail(int n ,int a,int b){
        if(n==0)return a;
        return fibTail(n-1,b,a+b);
    }
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
       System.out.println(fib(n));
       System.out.println(fibTail(n, a, b));
    }
    
}
