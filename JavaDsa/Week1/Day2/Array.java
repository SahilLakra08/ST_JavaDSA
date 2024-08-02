package Week1.Day2;
import java.util.Scanner;;
public class Array {
    //Arr  function to find the sum of the complete array
/*
public static int sum(int arr[]){
    int sum=0;
    for(int i=0;i<=arr.length;i++){
        sum+=arr[i];
    }
    return sum;

}
  public static void main(String[] args) {
        int[]arr1=new int [5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;
        System.out.println(sum(arr1));
    }
    */
/* 
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int[]arr1=new int [5];
            for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
         System.out.println(sum(arr));
        }
}
*/
        //TO SEARCH AN ELEMENT IN OUR ARRAAY
/* 
        public static int search(int arr[],int b){
            int sum=0;
            for(int i=0;i<=arr.length;i++){
                if(arr[i]==b){
                    return i;

                }
            }
            return -1;
        }
public static int sum(int[]arr,int b) {
    Scanner sc=new Scanner(System.in);
        int sum=0;
           
            for(int i=0;i<arr.length;i++){
            sum+=arr[i];
}
return sum;
}
public static void main(String[] args) {
    int b=9;
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
}
    */

    // FOR SWAP NUMBER IN ARRAY
    /*/
    public static void swap(int a, int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a; 
        int b;
        System.out.println("Values before swapping:");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println("values after swapping:");
      
        System.out.println(a+" "+b);
        swap(a,b);;
}
        */
//CREATE A FUNCTION TO REVERSE AN ARRAY
/* 
public static void reverseArray(int arr[]) {
    int i=0,j=arr.length-1;
    while(i<j)
    change(arr,i++,j--);
}
static void change(int[]arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=arr[i];

}
static void print(int[]arr){
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]+" ");
    System.out.println();
}
public static void main(String[] args) {
    int a=10;
    int b=15;
    int[]arr={1,2,3,4,5,6,7,8,9};
    reverseArray(arr);
        print(arr);
    
}
*/

//FIND THE MAXIMUN IN AN ARRAY
/* 
public static void main(String[] args) {
    int arr[]={1,23,233,5,67,55,76,99};
    int maxValue=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>maxValue){
            maxValue=arr[i];

        }
    }
    System.out.println(maxValue);
}
    */


}   



