<%
    String getUserAgent = request.getHeader("User-Agent").toLowerCase();
    if(null==getUserAgent){
        response.sendRedirect("/platform/login.jsp");
    }
    getUserAgent = getUserAgent.toLowerCase();

    response.sendRedirect(request.getContextPath()+"/platform/login.jsp");
%>
<%--<html>
<body>
<h2>Hello World!</h2>
</body>
</html>--%>
