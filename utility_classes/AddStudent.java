package utility_classes;

import helper_class.ConnectionProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {

    public static void addStudent() throws IOException {

        Connection con = ConnectionProvider.makeCon();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Enter Student Name : ");
            String name = br.readLine();
            System.out.print("Enter Student Address : ");
            String add = br.readLine();
            System.out.print("Enter Student Phone Number : ");
            String phone_no = br.readLine();

            String q = "Insert into stu_mg (name,addre,phone_no) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,name);
            ps.setString(2,add);
            ps.setString(3,phone_no);

            int count=ps.executeUpdate();
            if (count>0)
            {
                System.out.println();
                System.out.println("Inserted...");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("Something went Wrong...");
                System.out.println();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (con!=null)
            {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
