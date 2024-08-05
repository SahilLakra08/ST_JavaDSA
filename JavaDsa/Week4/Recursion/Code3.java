package ST_JavaDSA.JavaDsa.Week4.Recursion;
public class Code3 {
    //TAIL RECURSION
    static int countEven(int n,int  count){
        if(n==1)
            return count;
        if(n%2==0)count++;
        return countEven(n-1,count);   
    }
    //HEAD RECURSION
    static int countHead(int n){
        if(n==1)return 0;
        if(n%2==0) return 1+ countHead(n-1);
        else return countHead(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        // int count=0;
        // while(n>1){
        //     if(n%2==0)count++;
        //     n--;
        //     }
        //System.out.println(count);
        System.out.println(countEven(n,0));
        System.out.println(countEven(n, 0));
    }   
}
