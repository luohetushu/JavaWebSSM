<%--
  Created by IntelliJ IDEA.
  User: murongyunge
  Date: 2020/6/6
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
      <title>学员简介</title>
  </head>
  <body>
      <h3>欢迎进入学员介绍天地！！！</h3>
      <p>首先，来了解 ${requestScope.student.name} 同学：</p>
      <fmt:formatDate value="${requestScope.student.birthday}" pattern="yyyy年MM月dd日" var="birthday" scope="page"/>
      <p>${requestScope.student.name} 同学，性别 ${requestScope.student.sex}，今年 ${requestScope.student.age} 岁，
          出生于 ${pageScope.birthday}， 时薪为 ${requestScope.student.salary} 琉璃</p>
  </body>
</html>
