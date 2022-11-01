import java.util.*;
class Admin extends Info
{
    protected String pass= "123456";
    void addEmployee(String n, String p)
    {
        employeeMap.put(n, p);
    }
    void disp()
    {
        for(Map.Entry m:employeeMap.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }
    }
}