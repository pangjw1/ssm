<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   <a href="${pageContext.request.contextPath }/add.jsp">增加</a>
    <table>
       <tr>
          <td>编号</td>
          <td>名称</td>
          <td>操作</td>
       </tr>
       <c:forEach items="${goodslist }" var="gl">
          <tr>
          <td>${gl.id }</td>
          <td>${gl.name }</td>
          <td><a href="${pageContext.request.contextPath }/goods/delete.action?id=${gl.id }">删除</a>
              <a href="${pageContext.request.contextPath }/goods/yupdate.action?id=${gl.id }">修改</a></td>
       </tr>
       </c:forEach>
    </table>
</body>
</html>