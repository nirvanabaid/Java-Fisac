import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Employee extends Info {
    Scanner in = new Scanner(System.in);
   void Requestleave(String user_name, String reason, String status)
   {
     leave[s][0] = user_name;
     leave[s][1] = reason;
     leave[s][2] = status;
     s++;
   }
   void ReviewLeave(String user_name)
   {
    if(s==0)
    {
        System.out.println("No Leave Requests Found.");
        
    }
    else{
    for(int i = 0; i < s; i++)
    {
        
            if(leave[i][0].compareTo(user_name)==0)
            {
                System.out.println("USERNAME- "+ leave[i][0]);
                System.out.println("REASON- "+ leave[i][1]);
                System.out.println("REQUEST STATUS- "+ leave[i][2]);
            }
        
    }
    }
}
   

   void viewAttendance(String user_name)
   {
        for(int i=0; i<l;i++)
        {
            if(user_name.compareTo(ename[i])==0)
            {
                System.out.println("No. of days present- "+p[i]);
                System.out.println("No. of days absent- "+a[i]);
                
            }
        }
   }


}
