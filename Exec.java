import java.util.*;
abstract class Info
{
    static HashMap<String,String> employeeMap=new HashMap<String,String>();
    static HashMap<String,String> employerMap=new HashMap<String,String>();
    static int a[][]= new int [100][3];
    static int s=0;
 
}

class Exec
{
    public static void main(String[] args) {
        Admin a= new Admin();
        
        a.addEmployee("nirvana", "123456");
        a.addEmployee("aman", "hello");

        a.disp();
        Employer b= new Employer();
        b.addEmployee("aadarsh", "employer");
        System.out.println(b.s);
        a.disp();
        
    }
}