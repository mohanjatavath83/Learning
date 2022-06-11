package com.learning.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

    public Connection con = null;

    public JDBCConnection()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "minuD83#");

        }catch (Exception ex)
        {

           ex.printStackTrace();
        }

    }





}
