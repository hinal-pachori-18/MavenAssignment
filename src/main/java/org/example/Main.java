package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        JsonData.getData();
        System.out.println("Addition of 2 number is "+Calculation.Add(12,3));
        DataUpdation.updateData();
    }
}