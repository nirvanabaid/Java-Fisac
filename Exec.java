import java.net.SocketTimeoutException;
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
        Scanner sc= new Scanner(System.in);
        Admin a= new Admin();
        String pass;
        int choice;
       while(true){
        System.out.println("Enter 1 for Admin");
        System.out.println("Enter 2 for Employee");
        System.out.println("Enter 3 for Employer");
        switch(choice){
            case 1: 
            System.out.println("Enter the Admin password");
            pass= sc.nextLine();
            if(pass == a.pass){
            }
            else{
                System.out.println("Incorrect password");
            }
            }
            break;
            case 2:
            System.out.println("Enter the Employee password");
            break;
            case 3:
            System.out.println("Enter the Employer password");
            break;

        }

        }
       }
        
    }
}