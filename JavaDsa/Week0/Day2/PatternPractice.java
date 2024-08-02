package Week0.Day2;
import java.util.Scanner;
public class PatternPractice {
    
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

    /*    Ques 1:
    n = 5
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *    */

    /*int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
    System.out.println( );
    }
*/

/* 
     Ques 2:
     n = 5
    *
    * *
    * * *
    * * * *
    * * * * *
 */
/*int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println( );
}
    */

/* 
    Ques 3:
    n = 5
    * * * * *
    * * * *
    * * *
    * *
    *
*/

/* 
int n=5;
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
*/

/* 
Ques 4:
n = 5
        *
      * *
    * * *
  * * * *
* * * * *
*/
/* 
int n=5;
for (int i=1;i<=;i++){
    for(int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();

}
*/
/* 
Ques 5:
n = 5
      * * * * *
        * * * *
          * * *
            * *
              *
*/
/* 
int n=5;
for(int i=n;i>=1;i--){
    for(int k=1;k<=(n-i)+1;k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }System.out.println();
}
    */

    /*
     Ques 6:
n = 5
      * * * * *
          * * * *
              * * *
                  * *
                      *
     */
        /*
        int n=5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++)
            System.out.print("    ");
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*
 * Ques 7:
n = 5
* * * * *
*       *
*       *
*       *
* * * * *
 */
/*
int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if (i==n || j==n || i==1||j==1 ) {
            System.out.print("* ");
        }else
    System.out.print("  ");
}System.out.println();
}  
*/

/*
Ques 8:
n = 5 
   star pattern 
   (cross)
   *       *
     *   * 
       *
     *   * 
   *       *    
  
     */
    /*  
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==j||i+j==n+1||i==n && j==n ) {
                    System.out.print("* ");
                }else
            System.out.print("  ");
        }System.out.println();
        }     
*/
/* 
Ques 9: 
n = 5 
Ques 9: 
n = 5 
                 *  
               * * *  
             * * * * *  
           * * * * * * *  
         * * * * * * * * * 
        
         */
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.println(" ");
            }
            for(int j=1;j<=)
        }
   
   
        }
}


