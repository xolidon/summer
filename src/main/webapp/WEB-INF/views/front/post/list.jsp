<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
        </tr>
        <c:forEach var="post" items="${page.list}">
            <tr>
                <td>${no}</td>
                <td>${post.title}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

