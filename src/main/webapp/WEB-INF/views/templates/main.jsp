<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href='<c:url value="/resources/stylesheets/estilo.css"/>'>


<!-- Inclusao de titulo pelo Tiles -->
<title><tiles:getAsString name="titulo" /></title>
</head>
<body>
	<!-- Inclusao do Cabecalho -->
	<tiles:insertAttribute name="cabecalho" />

	<!-- Inclusao do Conteudo -->
	<tiles:insertAttribute name="conteudo" />

	<!-- Inclusao do Rodape -->
	<tiles:insertAttribute name="rodape" />
</body>
</html>