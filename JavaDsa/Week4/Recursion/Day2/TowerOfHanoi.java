package Day2;
/*Tower of Hanoi
[Math, Recursion]

Tower of Hanoi is a mathematical puzzle where we have 3 rods and n disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

Only one disk can be moved at a time.

Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.

No disk may be placed on top of a smaller disk.

Write a program which prints a sequence of operations that move n disks from one rod to another.

Example for 3 disks:
faq.disk3 */
public class TowerOfHanoi {
    static void TowerOfHanoi(int n,String from,String to,String through){
        if(n==1){
            System.out.println("from disk1 "+from+"to"+to);
            return;
        }
        else{
            TowerOfHanoi(n-1, from,through,to);
            System.out.println("move disk"+n+"from"+from+"to"+to);
            TowerOfHanoi(n-1, through, to, from);
        }

    }
    public static void main(String[] args) {
        int n=3;
        String from=" A ";
        String to=" B ";
        String through=" C ";
        TowerOfHanoi(n, from, to, through);
    }

}
