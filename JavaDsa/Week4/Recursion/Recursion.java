package ST_JavaDSA.JavaDsa.Week4.Recursion;

public class Recursion {
    static void print(int n){
        //base case
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        print(n);
        //while(n<=10)
        //System.out.println(n);
        //n++;
    }
    
}
