package services;

import java.sql.*;

/**
 * Created by Brady Ibanez on 11/2/2016. Intended to allow for initiation and creation of DB and DB connections.
 */
    public class SQLiteJDBC
{
    public static void main( String args[])
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
