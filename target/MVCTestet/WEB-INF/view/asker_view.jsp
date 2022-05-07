<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>

<body>

<h2> Hello Employee. Write your name! </h2>

<br>
<br>


<form:form action="res_ques" modelAttribute="country" method="get">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Population: <form:input path="population"/>
    <form:errors path="population"/>
    <br>
    Currency: <form:input path="currency"/>
    <form:errors path="currency"/>
    <br>
    Deputees:
    <form:select path="deputees">
        <form:options items="${country.deputees}"/>
    </form:select>

    <br>
    which language do this country has?
    <form:radiobuttons path="languagesInCountry" items="${country.languagesInCountry}"/>
    <br>
    whick sea has it?
    <form:checkboxes path="allSeas" items="${country.seas}"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>

</html>