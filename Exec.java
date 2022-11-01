import java.net.SocketTimeoutException;
import java.util.*;
abstract class Info
{
    static HashMap<String,String> employeeMap=new HashMap<String,String>();
    static HashMap<String,String> employerMap=new HashMap<String,String>();
    static String leave[][]= new String [100][3];
    static int s=0;
 
}

class Exec
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Admin a= new Admin();
        String password;
        int choice;
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
            }
            else{
                System.out.println("Incorrect password");
            }
            
            break;
            case 2:
            System.out.println("Enter the Employee password");
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
