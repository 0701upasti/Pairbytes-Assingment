<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<style>
	body{
	margin: 0;
            padding: 0;
            height: 100vh;
            transition: background 1s ease; /* Smooth transition */
	}
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: yellow;
}
</style>
<hr style="border: 2px solid red;">
<h1 style="text-align:center"><u> Employee Management System </u></h1>
	<form action="save" method="post">
		<table>
			<tr>
				<th>Id : <input type="text" name="id"></th>
				<th>Name : <input type="text" name="name"></th>
				<th>Department : <input type="text" name="age"></th>
				<th>Email : <input type="text" name="email"></th>
				<th>Mobile No. : <input type="text" name="mobile"></th>
			</tr>
		</table>
		<br>
					
		<table style="width:20px; margin-left: auto;  margin-right: auto;">
		<tr>
		<th><input type="submit" value="Save">
		<th><button formaction="update">Update</button>
		<th><button formaction="delete">Delete</button>
		<th><input type="reset" value="Reset">
			</tr>
		</table>
	</form>

<br>
<hr style="border: 2px solid red;">
	<table>

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Department</th>
			<th>Email</th>
			<th>Mobile No.</th>
		</tr>


		<%
		out.println("<center><h1><u>Employees Details</u><h1></center>");
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_info", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(2)
			+ "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td></tr>");
		}
		%>



	</table>
<hr style="border: 2px solid red;">
<p style="text-align: center;">@Pairbytes Software</p>



  <script>
        
        const backgrounds = [
            'linear-gradient(to right, #ff7e5f, #feb47b)', 
            'linear-gradient(to right, #6a11cb, #2575fc)',
            'url("https://example.com/image1.jpg")',
            'url("https://example.com/image2.jpg")'
        ];

        let index = 0;

        // Function to change background
        function changeBackground() {
            document.body.style.background = backgrounds[index];
            document.body.style.backgroundSize = "cover"; 
            document.body.style.backgroundRepeat = "no-repeat";
            index = (index + 1) % backgrounds.length;
        }

        
        setInterval(changeBackground, 4000);

       
        changeBackground();
    </script>
</body>
</html>