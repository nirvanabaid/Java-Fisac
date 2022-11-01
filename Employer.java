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
            try{
                if(stat!=1 && stat!=0){
                    throw new exception("Please enter either 1 or 0");
                }
            }
            catch(exception e){
                System.out.println(e.getMessage());
            }
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
        try{
            if(approve!=1 && approve!=0){
                throw new exception("Please enter either 1 or 0");
            }
        }
        catch(exception e){
            System.out.println(e.getMessage());
        }
        if (approve==1){
            return true;
        }
        else{
            return false;
        }
    }
}

