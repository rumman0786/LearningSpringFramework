<%--
  @author rumman
  @since 9/10/18
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
  <head>
    <title>Hello World</title>
  </head>
  <body>
      Hello, ${authUser.username}!!! Who Lives in ${authUser.address}
  </body>
</html>
