package Week1.Day1;

public class Day1 {

    //WRITING A FUNCTION
    public  static void displayArray(int[]arr){
        //code for displaying my array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //String is a array of type"Char".
        //int[]arr=new int[10];
       // char[]arr=new char[5];
        //arr[0]='a';

        //System.out.println(arr);
        int arr[]=new int[10];
        arr[1]=10;
        arr[2]=110;
        arr[6]=110;
        arr[9]=101;
        displayArray(arr);


    }
    
}
