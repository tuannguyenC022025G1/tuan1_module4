<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    Exchange Rate: <input type="text" name="rate"/><br/>
    USD Amount: <input type="text" name="usd"/><br/>
    <input type="submit" value="Convert"/>
</form>
