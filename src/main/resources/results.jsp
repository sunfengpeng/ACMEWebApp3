<%@ page import="com.acme.conversion.currency.service.CurrencyExchangeService,
 com.acme.conversion.currency.service.CurrencyExchangeServiceFactory,
com.acme.conversion.currency.Currency, java.text.DecimalFormat" %>
<%
    String startCurrStr=request.getParameter("startingCurrency");
    String endCurrStr=request.getParameter("endingCurrency");
    String amountStr=request.getParameter("amount");
    double amount=Double.parseDouble(amountStr);
    DecimalFormat df=new DecimalFormat("0.00");
    CurrencyExchangeService service=CurrencyExchangeServiceFactory.getService();
    double rate=CurrencyExchangeServiceFactory.requestCurrentRate(startCurrStr, endCurrStr);
    //double rate=service.requestCurrentRate(startCurrStr, endCurrStr);
%>
<html><head>    <title>ACME Currency Converter - Results</title></head>
<body>    <h1>ACME Currency Converter - Results</h1>
    <p>        Here are the results of your currency conversion. Enjoy!    </p>
    <p>
        Starting currency: <%=startCurrStr%><br>
        Ending currency: <%=endCurrStr%><br>
        Amount converted: <%=df.format(amount)%><br>
        Exchange rate: <%=df.format(rate)%><br>
        Amount after exchange: <%=df.format(amount*rate)%><br>    </p>
    <p>        <a href="index.jsp">Return to main page</a>    </p></body></html>