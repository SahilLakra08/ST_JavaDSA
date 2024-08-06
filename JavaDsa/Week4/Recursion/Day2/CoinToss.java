package Day2;

public class CoinToss {

    //BY TAIL RECURSION
    static void Toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        else{
            Toss(n-1,ans+"H");
            Toss(n-1,ans+"T");
        }
    }
    public static void main(String[] args) {
       Toss( 2, "");
    }  
}
