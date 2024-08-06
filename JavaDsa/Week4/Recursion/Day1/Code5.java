package ST_JavaDSA.JavaDsa.Week4.Recursion;

public class Code5 {
    //FACTORIAL
    //HEAD RECURSION 
    static int fact(int n){
        if(n==1 || n==0)return 1; 
        return n*fact(n-1);
    }
    //TAIL RECURSION
    static int factTail(int n,int ans){
        if(n==1 || n==0)return ans;
        return factTail(n-1,n*ans);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        System.out.println(fact(n));
        System.out.println(factTail(n,ans));
    }
    
}
