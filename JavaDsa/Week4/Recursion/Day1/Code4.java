package ST_JavaDSA.JavaDsa.Week4.Recursion;
public class Code4 {
    //POWER QUESTION
    //HEAD RECURSION
    static int power(int base,int power){
        if(power==0) return 1;
        return base*power(base, power-1);
    }
    //TAIL RECURSION
    static int powerTail(int base ,int power,int ans){
        if(power==0)return ans;
        return powerTail(base,power-1,ans*base);
    }
    public static void main(String[] args) {
        int base =2;
        int power=4;
        int ans=1;
        System.out.println(power(base, power));
        System.out.println(powerTail(base, power, ans));
    }
    
}
