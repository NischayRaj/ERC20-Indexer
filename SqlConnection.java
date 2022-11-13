
package erc20.indexer;


import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    
    //This code is used to make a connection with the mysql database.
    Connection c;
    Statement s;
    Conn() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///erc", "root", "");
        s = c.createStatement();
    }
        catch (Exception e) {
            e.printStackTrace();
        }
}
}

