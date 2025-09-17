<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<html>
<head>
<title><decorator:title default="My Shop" /></title>
</head>
<body>
	<div class="header">
		<h1>My Shop - Admin Panel</h1>
		<a href="${pageContext.request.contextPath}/admin/categories">Categories</a>
		| <a href="${pageContext.request.contextPath}/admin/products">Products</a>
		| <a href="${pageContext.request.contextPath}/admin/accounts">Accounts</a>
	</div>

	<hr />

	<div class="content">
		<decorator:body />
	</div>

	<hr />
	<div class="footer">
		<p>© 2025 MyShop</p>
	</div>
</body>
</html>
