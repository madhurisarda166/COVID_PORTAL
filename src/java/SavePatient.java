/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class SavePatient extends HttpServlet {
    Connection con; PreparedStatement ps;
@Override
public void init()
{
    try
    {
    String qr="insert into MedicalRec(name,age,gender,address,city,contact) values(?,?,?,?,?,?)";
    con=data.connect();
      ps=con.prepareStatement(qr);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter ();
         try{
             Class.forName("com.mysql.jdbc.Driver");
             out.println("driver loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/covid","root","root");
            out.println("Connection established");
            
    //        Integer pid=Integer.parseInt(request.getParameter("pid"));
            String pname=request.getParameter("pnm");
            Integer age=Integer.parseInt(request.getParameter("age"));
            String gender=request.getParameter("gndr");
            String address=request.getParameter("adr");
            String city=request.getParameter("cty");
            String mob=request.getParameter("mob");
           
          
            ps.setString(1,pname);
            ps.setInt(2,age);
            ps.setString(3,gender);
            ps.setString(4,address);
            ps.setString(5,city);
            ps.setString(6,mob);
            int n=ps.executeUpdate();
            con.close();
            out.println(n+"rows added");
            out.println("Registration completed");
         }
         catch(Exception e)
         {
             e.printStackTrace();
             out.println(e);
         }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
