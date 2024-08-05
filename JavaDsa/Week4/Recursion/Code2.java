package ST_JavaDSA.JavaDsa.Week4.Recursion;
public class Code2 {
    //TAIL RECURSION
    static int sum(int n,int a){
        if(n==1){
            return a+n;
        }
        return sum(n-1,a+n);
    }
    //HEAD RECURSION
    static int sumHead(int n){
        //base case
        if(n==1)return 1;
        //assumption
        int prevValueSum=sumHead(n-1);
        //proof
        return n+ prevValueSum;
    }
    public static void main(String[] args) {
        int n=10;
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum+=i;
        //     System.out.println(sum);
        // }   
        int sum=sum(n, 0);
        System.out.println(sum);
        System.out.println(sumHead(n));
       
    }
   
}
