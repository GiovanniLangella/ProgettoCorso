<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pgsArchivioAulaElimina.jsp</title>
</head>
<body>
<jsp:useBean id="beanAula" scope="session"
class="model.session.Aula">
<jsp:setProperty name="beanAula" property="*" />
</jsp:useBean>

<P align="center"><FONT size="+2" color="green">Sei sicuro di voler eliminare Aula?</FONT></P>


<FORM method="post" action="/Corso/CtrlArchivioAula">

<TABLE  align="center" >
<tr>



<td>
<INPUT type="submit" name="cmdAzione" value="Conferma" size="20" maxlength="50">
</td>

</tr>

<tr>

<td>
&nbsp;
</td>

</tr>

<tr>



<td>

<INPUT type="submit" name="cmdAzione" value="Annulla" size="20" maxlength="50">

</td>

</tr>
</TABLE >
</FORM>
</body>
</html>
