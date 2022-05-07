<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>

<body>

<h2> Hello Employee. here's what we have! </h2>

Your country name: ${country.name}
<br>
Your population: ${country.population}
<br>
Your currency: ${country.currency}
<br>
Your deputy:${country.deputees}
<br>
Your language:${country.languagesInCountry}
<br>
Your seas:
<ul>
    <c:forEach var="lang" items="${country.seas}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
</body>
</html>