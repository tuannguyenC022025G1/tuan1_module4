<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Customer Info</title></head>
<body>
<fieldset>
    <legend>Customer Information</legend>
    <p>Id: ${customer.id}</p>
    <p>Name: <input value="${customer.name}" /></p>
    <p>Email: <input value="${customer.email}" /></p>
    <p>Address: <input value="${customer.address}" /></p>
    <button>Update</button>
</fieldset>
<p><a href="/customers">Back to list</a></p>
</body>
</html>
