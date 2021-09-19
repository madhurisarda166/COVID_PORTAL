
import java.sql.Connection;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class PatientDetails {
    Connection con;
    public ResultSet getdata(int t){
        ResultSet rs=null;
        String qr=null;
       try{
           if(t==0){
             qr="Select * from medicalrec";
           }
           if(t==1){
           qr="Select * from medicalrec where checked_Patient is NULL";
           }
           if(t==2){
           qr=" select id,name,age,gender,address,city,contact,Result from medicalrec inner join lab_result on medicalrec.id=lab_result.PatientID and checked_patient is not null";
           }
    con=data.connect();
    Statement stmt=con.createStatement();
    rs=stmt.executeQuery(qr);
    
       }
       catch(Exception e){
       e.printStackTrace();
       }
   
  return rs;
    }
 /*public static void main(String ar[]){
     PatientDetails p=new PatientDetails();
     ResultSet r=p.getdata();
     int c=0;
     try{
     while(r.next()){
         c++;
     
     }
     System.out.println(c);
     }
     catch(Exception e){
     e.printStackTrace();}
 } */  
}

