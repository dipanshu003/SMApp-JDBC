package utility_classes;

import helper_class.ConnectionProvider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {
    public static void updateStudent() {
        Connection con = ConnectionProvider.makeCon();
        Scanner x = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter 1 to Update Student Name");
            System.out.println("Enter 2 to Update Student Address");
            System.out.println("Enter 3 to Update Student Phone Number");
            System.out.println("Enter 4 to Go to Main Menu");
            System.out.println();
            System.out.print("Enter Number From Above : ");

            int n = x.nextInt();


            try {
                if (n == 1) {
                    System.out.print("Enter New Student Name : ");
                    String stu_newName = br.readLine();
                    System.out.print("Enter Student id Where You Want to Update : ");
                    int stu_id = x.nextInt();
                    String q = "update stu_mg set name = ? where id = ?";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, stu_newName);
                    ps.setInt(2, stu_id);

                    int count = ps.executeUpdate();
                    if (count > 0) {
                        System.out.println();
                        System.out.println("Update Successfully...");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Something went wrong...");
                        System.out.println();
                    }
                } else if (n == 2) {
                    System.out.print("Enter New Student Address : ");
                    String stu_newAddress = br.readLine();
                    System.out.print("Enter Student id Where You Want to Update : ");
                    int stu_id = x.nextInt();
                    String q = "update stu_mg set addre = ? where id = ?";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, stu_newAddress);
                    ps.setInt(2, stu_id);

                    int count = ps.executeUpdate();

                    if (count > 0) {
                        System.out.println();
                        System.out.println("Update Successfully...");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Something went wrong...");
                        System.out.println();
                    }

                } else if (n == 3) {
                    System.out.print("Enter New Student Phone Number : ");
                    String stu_newPhoneNo = br.readLine();
                    System.out.print("Enter Student id Where You Want to Update : ");
                    int stu_id = x.nextInt();
                    String q = "update stu_mg set phone_no = ? where id = ?";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, stu_newPhoneNo);
                    ps.setInt(2, stu_id);

                    int count = ps.executeUpdate();

                    if (count > 0) {
                        System.out.println();
                        System.out.println("Update Successfully...");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Something went wrong...");
                        System.out.println();
                    }
                }
                else {
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (con != null)
        {
            try
            {
                con.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }

}
