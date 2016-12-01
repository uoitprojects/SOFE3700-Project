package controllers;

import play.mvc.Controller;
import play.mvc.*;
import views.html.*;
import java.sql.*;
import javax.script.*;


/**
 * Created by 100551324 on 11/29/2016.
 */
public class SpotController extends Controller{

    public Connection connect() {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:appdb.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }

    public Result spotest() {
        return ok(tracks.render());
    }


    public void insert(String table, String id, String name, String type) {
        if (table == "Artist") {
            String sql = "INSERT INTO Album VALUES(?,?,?,?,?,?,?,?)";

            try (Connection c = this.connect();
                 PreparedStatement ps = c.prepareStatement(sql)) {
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, type);
                ps.executeUpdate();
                c.commit();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        /*
        if (table == "Album") {
            String sql = "INSERT INTO Album VALUES(?,?,?,?,?,?,?,?)";

            try (Connection c = this.connect();
                 PreparedStatement ps = c.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setDouble(2, capacity);
                ps.executeUpdate();
                c.commit();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }*/

    }

}

