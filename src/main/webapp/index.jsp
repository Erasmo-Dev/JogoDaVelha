<%@page  import="br.com.jogo.controle.Controle"%>
<%@page  import="br.com.jogo.servlet.Servlet"%>
<%@page  import="br.com.jogo.entidade.Jogo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

<link href="css/geral.css" rel="stylesheet">

</head>

<body>



<form action="Jogo" method="GET">
<div class="container">
			<div class="mb-3">
				<label class="form-label">
					<%out.println(request.getAttribute("vencedor"));%>
			</label>
			</div>
		<div class="row">
			<button id="casa" class="col-sm" <%out.println(Servlet.d1);%> type="submit" name="0" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("00"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d2);%> type="submit" name="1" value="<%out.println(Controle.jogador());%>"><%out.println(request.getAttribute("01"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d3);%> type="submit" name="2" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("02"));%></button>
		</div>

		<div class="row">
			<button id="casa" class="col-sm" <%out.println(Servlet.d4);%> type="submit" name="3" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("10"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d5);%> type="submit" name="4" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("11"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d6);%> type="submit" name="5" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("12"));%></button>
		</div>

		<div class="row">
			<button id="casa" class="col-sm" <%out.println(Servlet.d7);%> type="submit"name="6" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("20"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d8);%> type="submit"name="7" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("21"));%></button>
			<button id="casa" class="col-sm" <%out.println(Servlet.d9);%> type="submit"name="8" value="<%out.println(Controle.jogador());%>" ><%out.println(request.getAttribute("22"));%></button>
		</div>
		<div class="mb-3">
				<label class="form-label">
				<%out.println("É a vez do "+ Controle.jogador());%>
		</label>
		</div>
		
</div>		

</form>	

	
	
</body>

</html>