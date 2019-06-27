<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*,com.lti.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="NewCustomer.html">Add New Employee</a><br><br>
<h1>Customers List</h1>
<% List<Customer> list=CustomerDAO.getAllEmployees(); %>
<TABLE BORDER=1 WIDTH="100%">
<TR>
 <TH>Customer ID</TH> 
 <TH> Customer Name</TH>
 <TH>Password</TH>
   <TH>Email</TH>
   <TH>Country</TH>
   <TH>Edit</TH>
   <TH>Delete</TH>
   
 </TR>
 
 <% for(Customer i:list)
 {
 %>
 <TR>
 <TD><%=i.getId() %></TD>
 <TD><%=i.getName() %></TD>
 <TD><%=i.getPassword()%></TD>
 <TD><%=i.getEmail()%></TD>
     <TD><%=i.getCountry() %></TD>
     <TD><a href='EditServlet?id="+<%=i.getId()%>+"'>Edit</a></TD>
     <TD><a href='DeleteServlet?id="+<%=i.getId()%>+"'>Delete</a></TD></TR>
      <%}
%>
</TABLE>


</body>
</html>