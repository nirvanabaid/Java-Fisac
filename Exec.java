import java.net.SocketTimeoutException;
import java.util.*;
abstract class Info
{
    static HashMap<String,String> employeeMap=new HashMap<String,String>();
    static HashMap<String,String> employerMap=new HashMap<String,String>();
    static HashMap<String,Integer> employeeAttendance= new HashMap<String,Integer>();
    static String leave[][]= new String [100][3];
    static int s=0;
 
}

class Exec
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Admin a= new Admin();
        Employee e= new Employee();
        Employer b=new Employer();
        String password;
        String uid;
        int choice;
        int c;
        String reason;
       do{
        System.out.print("Enter 1 for Admin, ");
        System.out.print ("2 for Employee, ");
        System.out.print("3 for Employer and -1 to exit- ");
        
        choice = sc.nextInt();
        switch(choice){
            case 1: 
            System.out.println("Enter the Admin password");
            password= sc.next();
            if(password.compareTo(a.pass)==0){
                System.out.println("WELCOME.");
                do{
                    System.out.print("Enter 1 to add employee, 2 to remove employee, 3 to add employer, 4 to remove employer, -1 to exit- ");
                    c=sc.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.print("Enter username- ");
                        uid= sc.next();
                        System.out.print("Enter password- ");
                        password=sc.next();
                        a.addEmployee(uid, password);
                        break;
                        case 2:
                        System.out.print("Enter username- ");
                        uid=sc.next();
                        a.removeEmployee(uid);
                        break;
                        case 3:
                        System.out.print("Enter username- ");
                        uid= sc.next();
                        System.out.print("Enter password- ");
                        password=sc.next();
                        a.addEmployer(uid, password);
                        break;
                        case 4:
                        System.out.print("Enter username- ");
                        uid=sc.next();
                        a.removeEmployee(uid);
                        break;
                        case -1:
                        break;
                        default:
                        System.out.println("INVALID CHOICE. TRY AGAIN.");
                        break;
                    }
                }while(c!=-1);
            }
            else{
                System.out.println("Incorrect password");
            }
            
            break;
            case 2:
            System.out.println("Enter user id- ");
            uid = sc.next();
            System.out.println("Enter the Employee password");
            password= sc.next();
            if(password.compareTo(e.employeeMap.get(uid))==0){
                System.out.println("WELCOME.");
                do{
                System.out.print("Enter 1 to request leave, 2 to review leave status, -1 to exit- ");
                c=sc.nextInt();
                switch(c)
                {
                    case 1:
                    System.out.println("Enter reason for leave- ");
                    sc.nextLine();
                    reason=sc.nextLine();
                    e.Requestleave(uid, reason, "false");
                    break;
                    case 2:
                    e.ReviewLeave(uid);
                    break;
                    case -1:
                    break;
                    default:
                    System.out.println("INVALID CHOICE. TRY AGAIN.");
                    break;
                }
            }while(c!=-1);
            }
            else{
                System.out.println("Wrong password entered.");
            }
            break;
            case 3:
            System.out.println("Enter the Employer password");
            break;
            case -1:
            break;
            default:
            System.out.println("INVALID CHOICE. TRY AGAIN");

        }

        }while(choice!=-1);
       }
        
    }
