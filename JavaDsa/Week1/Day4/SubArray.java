package Week1.Day4;
//  CREATE A FUNCTION TO CREATE ALL THE SUB ARRAYS IN ARRAY:
public class SubArray {
   /* 
    public static void subArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++)
                System.out.print(arr[k]);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
   subArray(arr);
    }
    */


    //TO PRINT THE SUM OF INDIVIDUAL SUB-ARRAYS:
/* 
    public static void subArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++)
                sum+=arr[k];
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
   subArray(arr);
    }
    */


    //FIND THE MAXIMUM SUM FROM ALL THE SUB ARRAYS
   public static void subArray(int[]arr){
    int maxSum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++)
            sum+=arr[k];
            maxSum=Math.max(sum,maxSum);
        }
    }
    System.out.println(maxSum);
}
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
subArray(arr);
}
}
