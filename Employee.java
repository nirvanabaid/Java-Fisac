import java.util.*;
class Employee extends Info {
    Scanner in = new Scanner(System.in);
   void Requestleave(String user_name,String status, String reason)
   {
     leave[s][0] = user_name;
     leave[s][1] = status;
     leave[s][2] = reason;
     s++;
   }
   void ReviewLeave(String user_name)
   {
    for(int i = 0; i < s; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            if(leave[i][0] == user_name)
            {
                System.out.println(leave[i][j]);
            }
        }
    }
   }


}
