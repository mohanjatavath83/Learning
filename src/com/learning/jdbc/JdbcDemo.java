package com.learning.jdbc;

import com.learning.jdbc.connection.JDBCConnection;
import com.sun.org.apache.xml.internal.security.utils.JDKXPathAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


class Employee
{

    int id;
    String name;
    double salary;
}






public class JdbcDemo {



    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY) VALUES (?,?,?)";

    private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

    private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"
            + "("
            + " ID serial,"
            + " NAME varchar(100) NOT NULL,"
            + " SALARY numeric(15, 2) NOT NULL,"
            + " PRIMARY KEY (ID)"
            + ")";

    private static final String SQL_TABLE_DROP = "DROP TABLE EMPLOYEE";

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/learning", "root", "minuD83#");

            Statement stmt = con.createStatement();
            String query = "INSERT INTO EMPLOYEE (id,name, salary) VALUES (1,'bindia',12.900)";
            stmt.execute(query);
            stmt.close();
            System.out.println("successfully connection establised");


        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }
}

/*


Web Application
FLipkart
amazon
facbebook



      Local                   Local 127.0.0.1,Port 3306 database
     JAVA APPLICATION        DATABASE
                                   table
                                   rows




Machine1                    Machine2







 1) Establish connection
 2) table creation
 3) create statmemnt
 4) insert query




















 */

