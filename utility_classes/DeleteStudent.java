package utility_classes;

import helper_class.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
    public static void deleteStudent()
    {
        Connection con = ConnectionProvider.makeCon();
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Student id Where you want to Delete Record : ");
        int stu_id = x.nextInt();

        try
        {
            String q = "Delete From stu_mg where id = ? ";
            PreparedStatement ps =con.prepareStatement(q);
            ps.setInt(1,stu_id);
            int count =ps.executeUpdate();
            if (count > 0)
            {
                System.out.println();
                System.out.println("Deleted Successfully...");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("Something Went Wrong...");
                System.out.println();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (con!=null)
            {
                try {
                    con.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
