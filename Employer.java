import java.util.*;

public class Employer extends Info{
    Scanner sc=new Scanner(System.in);
    void emp_disp_all()
    {
        for (Map.Entry m: employeeMap.entrySet())
        {
            System.out.println("Employee: "+m.getKey());
        }
    }
    void addAttendance(){
        int stat; int i=0;
        System.out.print("Give attendance to all employees\n1 for Present\n0 for absent");
        while(i<l)
        {
            System.out.print("Employee: "+ename[i]+"      Status: ") ;
            stat=sc.nextInt();
            try{
                if(stat!=1 || stat!=0){
                    throw new exception("Please enter either 1 or 0");
                }
            }
            catch(exception e){
                System.out.println(e.getMessage());
            }
            if (stat==1){
                p[i]++;
                i++;
            }
            else{
                a[i]++;
                i++;
            }
        }
    }
    void leaveRec(){
        int approve;
        int i=0;
        
        while(i<s)
        {
        System.out.println("===============Leave Request===============");//From Reason of *n* Person
        System.out.println("USERNAME- "+ leave[i][0]);
        System.out.println("REASON- "+ leave[i][1]);
        System.out.println("Enter 0 for Rejection and 1 for Approval");
        approve=sc.nextInt();
        try{
            if(approve!=1 || approve!=0){
                throw new exception("Please enter either 1 or 0");
            }
        }
        catch(exception e){
            System.out.println(e.getMessage());
        }
        if (approve==1){
            leave[i][2]="ACCEPTED";
            i++;
        }
        else{
            leave[i][2]="DECLINED";
            i++;
        }
    }
    }
}

