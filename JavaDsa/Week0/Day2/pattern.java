package Week0.Day2;
import java.util.*;
public class pattern { public static void main(String[] args) {
    //LINEAR STAR PATTERN
   /*  int n;
    System.out.print("Number of STARS= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    System.out.print("* ");*/
   

    

    //SQUARE PATTERN USING NESTED FOR LOOP
   /*  int n;
    System.out.print("SQUARE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=n;j++) 
     System.out.print("* ");

     System.out.println("");
   }*/
  
  



  // RIGHT FACING TRIANGLE--->
  /*  int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("");
   }
*/





//LEFT FACING TRIANGLE
 /*int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<= n;i++)
   {
    for (int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("");
   }
*/





//INVERTED RIGHT FACING TRIANGLE
/*int n;
System.out.print("RIGHT TRIANGLE PATTERN= ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++) 
 System.out.print("* ");

 System.out.println("");
}*/






// INVERTED LEFT FACING TRIANGLE
/*int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=n;i>=1;i--)
   {
    for (int k=1;k<=(n-i);k++)
    System.out.print("  ");
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("");
   }*/





   //PRACTICE--->



   /*int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=n;i>=1;i--)
   {
    for (int k=1;k<=(n-i);k++)
    System.out.print("     ");
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("");
   }*/





  /*  int n;
    System.out.print("SQUARE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=n;j++) 
    if(i==1||i==n||j==1||j==n){
        System.out.print("* ");
    }else
    System.out.print("  ");
     

     System.out.println("");
   }
     */



   /*  int n;
    System.out.print("SQUARE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=n;j++) 
    if(i==1 &&j==1  || i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==5 && j==5){
    System.out.print("* ");
}
    else
     System.out.print("  ");

     System.out.println("");
   }

*/


/*int n;
System.out.print("SQUARE PATTERN= ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for (int i=1; i<=n; i++){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}*/

/*int n;
System.out.print("SQUARE PATTERN= ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for (int i=n; i>=1; i--){
    for (int k=1; k<=(n-i); k++)
        System.out.print("  ");3
    for (int j1=1; j1<=i; j1++)
        System.out.print("* ");
    for (int j2=1; j2<=i-1; j2++)
        System.out.print("* ");
    System.out.println();
}
    */

  /*   int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=n;i>=1;i-- )
   {
    for (int k=1;k<=(n-i);k++)
    System.out.print(" ");
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("  ");
   }
*/

/* 
int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++) 
     System.out.print("* ");

     System.out.println("");
   }
   for(int i=n-1;i>=1;i--)
{
for(int j=1;j<=i;j++) 
 System.out.print("* ");

 System.out.println("");
}
*/

/* 
int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for (int i=1; i<=n; i++){
        for (int k=1; k<=(n-i); k++)
            System.out.print("  ");
        for (int j=1; j<=i; j++)
            System.out.print("* ");
        System.out.println();
    }
    for (int i=n-1; i>=1; i--){
        for (int k=1; k<=(n-i); k++)
            System.out.print("  ");
        for (int j=1; j<=i; j++)
            System.out.print("* ");
        System.out.println();
    }
*/
/* 
int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
for (int i=n; i>=1; i--){
    for (int k=1; k<=(n-i); k++)
        System.out.print("    ");
    for (int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}
for (int i=2; i<=n; i++){
    for (int k=1; k<=(n-i); k++)
        System.out.print("    ");
    for (int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}
*/

int n;
    System.out.print("RIGHT TRIANGLE PATTERN= ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
for (int i=n; i>=1; i--){
    for (int k=1; k<=(n-i); k++)
        System.out.print("    ");
    for (int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}
for (int i=2; i<=n; i++){
    for (int k=1; k<=(n-i); k++)
        System.out.print("    ");
    for (int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}

}   
}
