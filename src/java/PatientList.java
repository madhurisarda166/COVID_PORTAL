/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class PatientList extends HttpServlet {
    Connection con;
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

        PrintWriter out=response.getWriter();
       // HttpSession session=request.getSession();
        //ArrayList<String> list=(ArrayList<String>)session.getAttribute("cart");
       out.println("<html>");
       out.println("<head>\n" +
"  <title>Patient Registration</title>\n" +
"  <meta name=\"description\" content=\"website description\" />\n" +
"  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n" +
"  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n" +
"  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" title=\"style\" />\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  <div id=\"main\">\n" +
"    <div id=\"header\">\n" +
"      <div id=\"logo\">\n" +
"        <div id=\"logo_text\">\n" +
"          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n" +
"          <h1><a href=\"index.html\">COVID 19 <span class=\"logo_colour\"> PORTAL</span></a></h1>\n" +
"          <h2>Let Us Contribute to Fight against CORONA VIRUS</h2>\n" +
"        </div>\n" +
"      </div>\n" +
"      <div id=\"menubar\">\n" +
"        <ul id=\"menu\">\n" +
"          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\n" +
"          <li class=\"selected\"><a href=\"index.html\">Home</a></li>\n" +
"          <li><a href=\"Registration.jsp\">Patient Registration</a></li>\n" +
"          <li><a href=\"PatientList\">Patient List</a></li>\n" +
"          <li><a href=\"result_update\">Update Report</a></li>\n" +
"          <li><a href=\"covid_tested\">COVID Tested</a></li>\n" +
"        </ul>\n" +
"      </div>\n" +
"    </div>");
       //out.println("<body>");
       
        try
        {
           PatientDetails pd=new PatientDetails();
           
        ResultSet rs=pd.getdata(0);
        int c=0;
       // while(rs.next()){
         //c++;
     
     //}
       // out.println(c);
        
        out.println("<h1 align='center'>Patients List</h1>");
        out.println("<hr>");
        out.println("<table border=2 align='center'><b>");
        
         out.println("<tr>");
        
        out.println("<td><b>ID</td>");
        out.println("<td><b>Patient Name</td>");
        out.println("<td><b>Age</td>");
        out.println("<td><b>Gender</td>");
        out.println("<td><b>Address</td>");
        out.println("<td><b>City</td>");
        out.println("<td><b>Contact</td>");
        
        out.println("</tr>");
        
       
        while(rs.next())
        {
        String s1=rs.getString(1);
        String s2=rs.getString(2);
        String s3=rs.getString(3);
        String s4=rs.getString(4);
        String s5=rs.getString(5);
        String s6=rs.getString(6);
        String s7=rs.getString(7);
        out.println("<tr>");
        out.println("<td>"+s1+"</td>");
        out.println("<td>"+s2+"</td>");
        out.println("<td>"+s3+"</td>");
        out.println("<td>"+s4+"</td>");
        out.println("<td>"+s5+"</td>");
        out.println("<td>"+s6+"</td>");
        out.println("<td>"+s7+"</td>");
        //out.println("<td><a href=removeitem?rid="+s1+">X</a></td>");
        out.println("</tr>");
        
        
        
       
        
        }
        /*
       
       out.println("</table>");
        */}
        catch(Exception e)
                {
                
                e.printStackTrace();
                }
      
        
       /* for(String tmp:list)
        {
        out.println(tmp);
        }
       */
       
       out.println("<pre>");
       
       
       
       out.println("<hr>");
       
       //out.println("<a href=buyerpage.jsp>Home page</a>");
       out.println("</body>");
       out.println("</html>");
        
        
    
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
