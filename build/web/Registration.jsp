<%-- 
    Document   : Registration
    Created on : 7 May, 2020, 3:43:41 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <title>Patient Registration</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" title="style" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">COVID 19 <span class="logo_colour"> PORTAL</span></a></h1>
          <h2>Let Us Contribute to Fight against CORONA VIRUS</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li class="selected"><a href="index.html">Home</a></li>
          <li><a href="Registration.jsp">Patient Registration</a></li>
          <li><a href="PatientList">Patient List</a></li>
          <li><a href="result_update">Update Report</a></li>
          <li><a href="covid_tested">COVID Tested</a></li>
        </ul>
      </div>
    </div>
<div align="center">
       <h1 align="center">Registration</h1>
        <form action="SavePatient" method="get" align="center">
        <pre>    
            <%-- Patient Id:    <input type="text" name="pid">
            --%>
        Patient name:  <input type="text" name="pnm">
        
        Age:           <input type="text" name="age">
        
        Gender:        <input type="text" name="gndr">

        Address:       <input type="text" name="adr">
        
        City :         <input type="text" name="cty">

        Contact No.    <input type="text" name="mob">
        
        
        
                      <input type="submit">
        </pre></div>
    </body>
</html>
