package ST_JavaDSA.JavaDsa.Week3.OOPS_Concepts.StudentsClass;

public class Class2 {
    public static void display(Students s){
        System.out.println(s.s);
        System.out.println(s.roll);
        System.out.println(s.semester);
        System.out.println(s.year);
        if(s.getBranchCode()<0 || s.getBranchCode()<4)
            System.out.println("No branch Assigned");
        else
            System.out.println(s.branch.branches[s.getBranchCode()]);        
    }
    public static void main(String[] args) {
        Students s1= new Students();
        Students utkarsh= new Students(
            69,
            "Utkarsh",
            5,
            2,
            3
        );
        Students naman=new Students(
           "naman",
           1,
           1 
         );
        utkarsh.setBranchCode(0);
        //utkarsh.branch_code=0;
        display(utkarsh);
        display(naman);
    }
    
}
