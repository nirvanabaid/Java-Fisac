import java.util.*;


abstract class Info
{
    static int a[]= new int [10];
    static int s=0;
    static HashMap<String,String> employeeMap=new HashMap<String,String>();
    static HashMap<String,String> employerMap=new HashMap<String,String>();
 
}
class Admin extends Info
{
    String pass= "123456";
    void addEmployee(String n, String p)
    {
        employeeMap.put(n, p);
    }
    void disp(String n)
    {
        System.out.println(employeeMap.get(n));
    }
}
class Demo
{
    public static void main(String[] args) {
        Admin a= new Admin();
        a.addEmployee("nirvana", "123456");
        a.addEmployee("aman", "hello");
        a.disp("aman");
        a.disp("nirvana");
        
    }
}