/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author hp
 */
public class data {
    public static Connection connect()
    {
       Connection con=null;
       try{
       Class.forName("com.mysql.jdbc.Driver");
       //con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/wipro","root","root");
       con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/covid","root","root");
       System.out.println("connection succesful");
       /*String qr="select * from master_user";
                    Statement stmt=con.createStatement();
                    //PreparedStatement ps=con.prepareStatement(qr);
                    ResultSet rs=stmt.executeQuery(qr);
                    if(rs.next())
                    {
                        //Toast.makeText(getApplicationContext(),"Data in the result set",Toast.LENGTH_LONG).show();
                        System.out.println(rs.getString(1));
                    }
      */
       }
       catch(Exception e)
       {
       e.printStackTrace();
       }
     return con;
     
    }
    
    public static void main(String ar[])
    {
    connect();}
    
    
    }
