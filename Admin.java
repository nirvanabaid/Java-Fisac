import java.util.*;

class Admin extends Info
{
    Scanner sc= new Scanner(System.in);
    protected String pass= "123456";
    void addEmployee(String n, String p)
    {
        employeeMap.put(n, p);
        employeeAttendance.put(n,0);
        
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
    void disp()
    {
        for(Map.Entry m:employeeMap.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }
    }
    
}
