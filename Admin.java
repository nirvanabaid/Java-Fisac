import java.util.*;

class Admin extends Info
{
    Scanner sc= new Scanner(System.in);
    protected String pass= "123456";
    void addEmployee(String n, String p)
    {
        employeeMap.put(n, p);
        employeeAttendance.put(n,0);
        ename[l]=n;
        Admin.p[l]=0;
        a[l]=0;
        l++;
        
    }
    void removeEmployee(String n)
    {
       
        System.out.print("Enter 'YES' to remove employee- ");
        String c= sc.nextLine();
        if(employeeMap.size()==0)
        {
            System.out.println("No employees present.");
        }
        else if(c.compareToIgnoreCase("yes")==0)
        {
            employeeMap.remove(n);
        }
        
    }
    void addEmployer(String n, String p)
    {
        employerMap.put(n, p);
    }
    void removeEmployer(String n)
    {
        System.out.print("Enter 'YES' to remove employee- ");
        String c= sc.nextLine();
        if(employerMap.size()==0)
        {
            System.out.println("No employers present.");
        }
        if(c.compareToIgnoreCase("yes")==0)
        {
            employerMap.remove(n);
        }
        
    }

    void employeeDisp()
    {
        Iterator employeeMapIterator = employeeMap.entrySet().iterator();
        while (employeeMapIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)employeeMapIterator.next();
 
            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey() + " : "
                               + mapElement.getValue());
        }
    }

    void employerDisp()
    {
        Iterator employerMapIterator = employerMap.entrySet().iterator();
        while (employerMapIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)employerMapIterator.next();
            
 
            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey() + " : "
                               + mapElement.getValue());
        }
    }

    void changePass()
    {
        String s;
        System.out.print("Enter current password- ");
        s=sc.next();
        if(s.compareTo(pass)==0)
        {
            //System.out.println();
            System.out.print("Enter new password- ");
            s=sc.next();
            System.out.print("Confirm new password- ");
            if(s.compareTo(sc.next())==0)
            {
                pass=s;
            }
            else{
                System.out.println("Passwords does not match.");
            }
        }
        else{
            System.out.print("WRONG PASSWORD");
        }
    }
    
}
