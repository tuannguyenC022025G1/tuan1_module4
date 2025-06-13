<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Simple Dictionary</title>
</head>
<body>
<h2>Simple English-Vietnamese Dictionary</h2>
<form action="/translate" method="post">
  Enter English word: <input type="text" name="word" />
  <input type="submit" value="Translate" />
</form>

<c:if test="${not empty result}">
  <h3>Result: ${result}</h3>
</c:if>
</body>
</html>
