<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Danh sách Category</h2>
<a href="${pageContext.request.contextPath}/admin/categories/create">➕
	Thêm mới</a>
<br />
<br />
<table border="1" cellpadding="5">
	<tr>
		<th>ID</th>
		<th>Tên</th>
		<th>Hành động</th>
	</tr>
	<c:forEach var="c" items="${categories}">
		<tr>
			<td>${c.id}</td>
			<td>${c.name}</td>
			<td><a
				href="${pageContext.request.contextPath}/admin/categories/edit/${c.id}">✏
					Sửa</a> | <a
				href="${pageContext.request.contextPath}/admin/categories/delete/${c.id}">🗑
					Xóa</a></td>
		</tr>
	</c:forEach>
</table>
