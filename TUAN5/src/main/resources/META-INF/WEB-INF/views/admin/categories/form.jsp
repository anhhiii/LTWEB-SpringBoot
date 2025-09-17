<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Category Form</h2>
<form action="${pageContext.request.contextPath}/admin/categories/save"
	method="post">
	<input type="hidden" name="id" value="${category.id}" /> <label>Tên
		Category:</label> <input type="text" name="name" value="${category.name}"
		required /> <br />
	<br />

	<button type="submit">💾 Lưu</button>
	<a href="${pageContext.request.contextPath}/admin/categories">⬅
		Quay lại</a>
</form>
