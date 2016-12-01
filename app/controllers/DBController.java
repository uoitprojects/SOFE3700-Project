package controllers;

import java.sql.*;

/**
 * Created by Brady Ibanez on 11/2/2016. Intended to allow for initiation and
 * creation of DB and DB connections. A connection is made to the server at the
 * predesignated address in order to collect data required by the application.
 */
    public class DBController
{
    public void db()
    {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:appdb.db");
        }   catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Database opened successfully");
    }
}
