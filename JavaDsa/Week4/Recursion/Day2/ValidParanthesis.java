package Day2;

public class ValidParanthesis {
    static void genParanthesis(int n,int l,int r,String ans){
        if(l==n && l==r){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l)return;
        genParanthesis(n, l+1, r, ans+"{");
        genParanthesis(n, l, r+1, ans+"}");
    }
    public static void main(String[] args) {
       genParanthesis(3, 0, 0, "");
    }
}
