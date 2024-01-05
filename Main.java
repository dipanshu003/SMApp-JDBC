import utility_classes.AddStudent;
import utility_classes.DeleteStudent;
import utility_classes.ShowStudent;
import utility_classes.UpdateStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wel-Come to Student Management Application");
        System.out.println();
        Scanner x = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 To Add Student Data");
            System.out.println("Enter 2 To Show Student Data");
            System.out.println("Enter 3 To Update Student Data");
            System.out.println("Enter 4 To Delete Student Data");
            System.out.println("Enter 5 To Exit Program");
            System.out.println();
            System.out.print("Enter Number From Above : ");
            int n = x.nextInt();
            System.out.println();
            try {

                if (n == 1) {
                    AddStudent.addStudent();

                } else if (n == 2) {
                    ShowStudent.showStudent();

                } else if (n == 3) {
                    UpdateStudent.updateStudent();

                } else if (n == 4) {
                    DeleteStudent.deleteStudent();
                } else if (n == 5) {
                    System.out.println("Program Closed...");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}