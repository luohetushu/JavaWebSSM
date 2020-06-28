<%--
  Created by IntelliJ IDEA.
  User: murongyunge
  Date: 2020/6/6
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>首页</title>
  </head>
  <body>
      <h3>欢迎进入学员介绍天地！！！</h3>
      <form action="${pageContext.request.contextPath}/select.form" method="post">
          请输入学员的编码：<input type="number" name="id"/><br/>
          <input type="submit" name="查询"/>
      </form>
  </body>
</html>
