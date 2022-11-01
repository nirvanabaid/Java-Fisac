import java.util.*;

public class Employer extends Info{
    Scanner sc=new Scanner(System.in);
    void disp_all()
    {
        for (Map.Entry m: employeeMap.entrySet())
        {
            System.out.println("Employee: "+m.getKey());
        }
    }
    void addAttendance(){
        int stat;
        System.out.print("Give attendance to all employees\n1 for Present\n0 for absent");
        for (Map.Entry m: employeeMap.entrySet())
        {
            System.out.print("Employee: "+m.getKey()+"Status: ") ;
            stat=sc.nextInt();
            if (stat==1){
                //Give Attendance
            }
            else{
                //No Attendance
            }
        }
    }
    boolean leaveRec(String n){
        int approve;
        System.out.println("0 for Rejection and 1 for Approve");
        System.out.println("Leave Request");//From Reason of *n* Person
        approve=sc.nextInt();
        if (approve==1){
            return true;
        }
        else{
            return false;
        }
    }
}

