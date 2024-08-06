package Day2;

public class subSequence {
    // //TAIL RECURSION
    // static void generateSub(String ques,String ans ){
    //     if(ques.isEmpty()){
    //         System.out.println(ans);
    //         return;
    //     }
    //     generateSub(ques.substring(1), ans+ques.charAt(0));
    //     generateSub(ques.substring(1), ans);
    // }
    //QUES: CREATE A FUNCTION USING HEAD RECURSION TO COUNT ALL THE SUBSEQUENCES STRINGS 
    static int  countSub(String ques){
        if(ques.isEmpty()){
        return 1;
        }
        //NUM1 is the count when you are including your first character
        int num1=countSub(ques.substring(1));
        //NUM2 is the count when you are not including your first character
        int num2=countSub(ques.substring(1));
        return num1+num2;
    }
    public static void main(String[] args) {
        //generateSub("TAP", "");
        String ques="CAR";
        System.out.println(countSub(ques));
    }
}


