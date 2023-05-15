package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataUpdation {
    public static void updateData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_EmployeeData", "freedb_hinal", "kw4!8WfXqq2g*jT");
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id to update data");
            int id = sc.nextInt();
            System.out.println("Enter name ");
            String name = sc.next();
            System.out.println("Enter email ");
            String email = sc.next();
            System.out.println("Enter phone number");
            long number = sc.nextLong();
            System.out.println();
            String query = "UPDATE Employee SET Emp_name = '" + name + "', Emp_email = '" + email + "' , Emp_phoneNumber = '" + number + "' WHERE Emp_id = " + id + ";";
            stmt.executeUpdate(query);
            if (stmt.executeUpdate(query) > 0) {
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("Failed");
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
