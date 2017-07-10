<%@ page import="main.java.connect" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%
    if(session.getAttribute("name")==null)
        response.sendRedirect("login.jsp");
    else{
        String uname= (String) session.getAttribute("name");
%>
<html>
<head>
    <title>Blog</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="well">
            <h3>Welcome <%=uname%></h3>
            <a href="/LogoutServlet" class="btn btn-default pull-right btn-sm" style="margin-top: -35px;">Logout</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-5">
                <form action="blog" method="post"><br><br>
                    <textarea name="AddBlog" placeholder="Enter the Content.." class="form-control" required></textarea><br><br>
                    <input type="submit" value="Save Blog" class="btn-primary btn-block"><br>
                </form>
        </div>
    </div>
<%
    connect c = new connect();
    int uId;
    String un = null;
    String content=null;
%>
    <h1>Blogs</h1>
    <table border='1' width='70%' style="margin-right:30px;">
    <tr><th>Editor</th><th>Content</th></tr><%
    try {
        PreparedStatement ps = c.con.prepareStatement("select * from addblog");
        ResultSet rs = ps.executeQuery();
        PreparedStatement ps1 = c.con.prepareStatement("select username from login where userid = ?");
        while (rs.next()) {
            uId = rs.getInt("uId");
            ps1.setInt(1, uId);
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next()) {
                un = rs1.getString("username");
            }
            content = rs.getString("blogContent");%>
            <tr><td><%=un%></td>
                <td><%=content%></td>
            </tr>
       <% } %>
        </table>
<% ps.close();
    rs.close();
    ps1.close();
}

catch (Exception e) {
    e.printStackTrace();
}%>
</div>
</body>
</html>
<% } %>