package Week3.Day4;
import java.util.*;
//BY TWO POINTER METHOD
public class SubString {
public static void SubString(String s){

for(int i=0;i<=s.length();i++){
    for(int j=i+1;j<=s.length();j++){
        System.out.println(s.substring(i, j));
    }
}
}  
public static void main(String[] args) {
    String a="abcd";
    SubString(a);
}
}
