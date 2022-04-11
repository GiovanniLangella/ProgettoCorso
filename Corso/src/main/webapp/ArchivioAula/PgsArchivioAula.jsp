<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="model.session.Aula"
import="model.dao.AulaService"
import="model.dao.AulaDAO" %>
<HTML>
<HEAD>
<%@ page
language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import="java.util.*"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<TITLE>pgsArchivioAula.jsp</TITLE>
</HEAD>
<BODY>

<FORM method="post" action="/Corso/CtrlArchivioAula" name="ArchivioAula">
<P>&nbsp;&nbsp; <input type="submit" name="cmdAzione" value="Torna alla Home">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font size="+3">Archivio Aula </font>
</P>
<% List<Aula> pgsElenco= (List<Aula>) request.getAttribute("elencoAula");
   if(pgsElenco.size() > 0){
    int i = 0;
   
%>
<TABLE border="1" >
<TBODY>
<TR>
<TD> </TD>
<TD>NumeroPosti</TD>  
<TD>Nome</TD>  
</TR>

<%while(i< pgsElenco.size()){
%>
<TR>
<TD>
<input type="radio" name="rdoMatricolaAula" value="<%= ((Aula)pgsElenco.get(i)).getid() %>" >
</TD>
<TD> <%= ((Aula)pgsElenco.get(i)).getnumeroposti() %></TD>
<TD> <%= ((Aula)pgsElenco.get(i)).getnome() %></TD>
</TR>
<% i++;
} %>
</TBODY>
</TABLE>
<P> </P>
<% } else{%> Non ci sono Aula<% } %> <BR>


<input type="submit" name="cmdAzione" value="Nuovo">
&nbsp;&nbsp;&nbsp;<input type="submit" name="cmdAzione" value="Modifica">
&nbsp;&nbsp;&nbsp;<input type="submit" name="cmdAzione" value="Elimina">

<br>
</Form>

</BODY>
</HTML>
