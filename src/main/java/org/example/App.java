package org.example;        // Feb 2023

import java.sql.*;
/**
 * Connecting to a MySQL Database Server.
 * This program simply attempts to connect to a database - but does nothing else.
 * You MUST first Start the MySql Server (from XAMPP)
 */

public class App
{
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    public void start() {

        System.out.println("\nSample 1 - Connecting to MySQL Database called \"test\" using MySQL JDBC Driver");

        String url = "jdbc:mysql://localhost/";
        String dbName = "test";
        String userName = "root";   // default
        String password = "";       // default

         try ( Connection conn =
                       DriverManager.getConnection(url + dbName, userName, password) )
        {
            System.out.println("SUCCESS ! - Your program has successfully connected to the MySql Database Server. Well done.");
            System.out.println("... we could query the database using the SQL commands you learned in DBMS...");
            System.out.println("... but for now, we will simply close the connection.");

            System.out.println("Your program is disconnecting from the database - goodbye.");
        }
        catch (SQLException ex)
        {
            System.out.println("Failed to connect to database - check that you have started the MySQL from XAMPP, and that your connection details are correct.");
            ex.printStackTrace();
        }
    }
}

