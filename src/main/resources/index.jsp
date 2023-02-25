<%@ page import="com.acme.conversion.currency.Currency, java.util.Iterator" %>
<html><head>    <title>ACME Currency Converter</title></head>
<body><h1>ACME Currency Converter</h1>
<p>Welcome to ACME Currency Converter!
    Please fill in the form below and submit it to perform a mock currency exchange.</p>
<form method="get" action="results.jsp">
    Starting currency:<select name="startingCurrency">
    <% Iterator startIter= Currency.getCurrencies();
        while (startIter.hasNext()){String currency=(String)startIter.next();
            out.println("<option value=\"" + currency + "\">" +
                    currency + "</option>");}    %>
</select><br>
    Ending currency:<select name="endingCurrency">
    <% Iterator endIter=Currency.getCurrencies();
    while (endIter.hasNext()) {
        String currency=(String) endIter.next();
        out.println("<option value=\"" + currency + "\">" + currency + "</option>");
    }
    %>
</select><br>
    Amount:<input type="text" name="amount" size="6" value="10"><br>
    <input type="submit" name="submit" value="Submit">
</form></body></html>