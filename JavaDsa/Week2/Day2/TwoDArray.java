package Week2.Day2;

public class 2Darray {
    // package Week1;

// import java.util.Scanner;

// public class TransposeoftwoDarray {
//     static void insert(int[][] arr) {
//         int count = 1;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 arr[i][j] = count++;

//             }
//         }
//     }

//     static void display(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void transpose(int[][] arr) {
//         int[][] nums = new int[5][6];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 nums[j][i] = arr[i][j];
//             }
//         }
//         display(nums);
//     }

//     public static void main(String[] args) {
        
//         int[][] arr = new int[5][6];
//         System.out.println(arr[0][2]);
//         insert(arr);
//         display(arr);
//          System.out.println("The transpose of the array is ");
//         transpose(arr);

//     }
// }

package Week1;

import java.util.Scanner;

public class TransposeoftwoDarray {
    static void insert(int[][] arr) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count++;

            }
        }
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] arr) {
        int[][] nums = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                nums[j][i] = arr[i][j];
            }
        }
        display(nums);
    }

    public static void main(String[] args) {
        
        int[][] arr = new int[3][5];
        System.out.println(arr[0][2]);
        insert(arr);
        display(arr);
         System.out.println("The transpose of the array is ");
        transpose(arr);

    }
}
}









package Week1;

import java.util.Scanner;

// Create a function to search an element in an array which return the index of the element that is found in the array 

public class TwoDArray {
    public static int[] search(int[][] arr, int num) {
        int[] searcharr = new int[2];
        searcharr[0] = -1;
        searcharr[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    searcharr[0] = i;
                    searcharr[1] = j;
                   
                }
            }
        }
        return searcharr;

        // System.out.println(searcharr[0] + " " + searcharr[1]); can be used to print if its void return type
       


        

        

    }

    

    

    static void insert(int[][] arr) {
        int count=1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // System.out.println("Enter the value of arr[ " + i + "]  and arr[ " + j + "]");
                arr[i][j] = count++;
                
            }
        }
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int [][][][] arr= new int [5][6][8][4];

        // How to declare a 2D array

        // datatpe [] [] nameof2Darray = new datatpe [rows][column];

        int[][] arr = new int[5][6];
        System.out.println(arr[0][2]);
        insert(arr);
        display(arr);
        int[] nums= search(arr, 12);
        // search(arr, 5);
        
        System.out.println(nums[0] + " " + nums[1]); 

    }

}






package Week1;

import java.util.*;

public class sortingintwoD {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 3 }, { 2, 6, 5 }, { 0, 70, 89, 10 } };
        
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                // Compare the rows based on the first element
                return Integer.compare(row1[0], row2[0]);
            }
        });

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Arrays.sort(arr);

    }
}





public class Bitwise {

    public static void main(String[] args) {
        /*
         * | bitwise OR     agar ek bhi 1 h to 1 output dega bits m
         * & bitwise AND    agar dono 1 h to hi sirf 1 dega output m
         * ^ bitwise XOR    agar same h bits to 0 different h to 1
         * ~ bitwise NOT    zero ko 1 aur 1 ko 0
         * 
         * << left shift    do operands maangta h aur fir number maangta h ki kitni baar left ya right shift krna h ..... jitni bhi bits h wo saari uthke ek side left chli jaayegi..... 1001->10010 (9 ko ek baar left shift kra to 18 bn gya)  a<<b=a*2^b
         * 
         * 
         * 
         * >> right shift   same as left shift ..... 1001 -> 100 right shift ke baad 9 ab 4 bn gya   a >> b = a/2^b
         * 
         * 
         * 
         */

        int a = 9;
        int b = 10;
        int oroperator;
        int andoperator;
        int xoroperator;
        int notoperator;
        int leftshiftoperator;
        int rightshiftoperator;

        oroperator= a|b;
        System.out.println("oroperator = " + oroperator);

        andoperator= a&b;
        System.out.println("andoperator = " + andoperator);

        xoroperator= a^b;
        System.out.println("xoroperator = " + xoroperator);

        notoperator= ~a;
        System.out.println("notoperator = " + notoperator);

        leftshiftoperator= a<<b;
        System.out.println("leftshiftoperator = " + leftshiftoperator);

        rightshiftoperator= a>>b;
        System.out.println("rightshiftoperator = " + rightshiftoperator);


    }
}









