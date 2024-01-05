package utility_classes;

import helper_class.ConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowStudent {
    public static void showStudent()
    {
        Connection con = ConnectionProvider.makeCon();

        try{
            String q = "select * from stu_mg";
            Statement st =con.createStatement();
            ResultSet set =st.executeQuery(q);

            System.out.println();
            while (set.next())
            {
                int id = set.getInt("id");
                String name = set.getString("name");
                String add = set.getString("addre");
                long phone_no = set.getLong("phone_no");
                System.out.println(id+" "+name+" "+add+" "+phone_no);
            }
            System.out.println();

        }catch (Exception e)
        {
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
