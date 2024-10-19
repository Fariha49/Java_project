/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bata;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author olo
 */
public class db {
    public static java.sql.Connection java_db(){
    java.sql.Connection conn=null;
    try{
        Class.forName("org.sqlite.JDBC");
        conn=DriverManager.getConnection("jdbc:sqlite:temp.db");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
}
