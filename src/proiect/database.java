/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Delian
 */
public class database {
    public static Connection connectDB(){
       try{
            //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            //String dburl = "jdbc:sqlserver://(localdb)\\MSSQLLocalDB;databaseName=proiect;integratedSecurity=true";
            //Connection connect = DriverManager.getConnection(dburl);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/baza_de_date_studenti", "root", "");
            return connect;
        }
        catch (Exception e){e.printStackTrace();}
        return null;
    }
}