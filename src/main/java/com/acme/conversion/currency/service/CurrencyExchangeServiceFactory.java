package com.acme.conversion.currency.service;
import com.acme.conversion.currency.service.CurrencyExchangeService;

public class CurrencyExchangeServiceFactory implements CurrencyExchangeService{
    private double rate;
    public CurrencyExchangeServiceFactory(){
        rate=1.5;
    }

    public static CurrencyExchangeService getService(){
        return null;
    }
    public static double requestCurrentRate(String fromCurrency, String toCurrency) {
        return 0;
    }



}





/*package com.acme.conversion.currency.service;

public class CurrencyExchangeServiceFactory{
    private double rate;
    public CurrencyExchangeServiceFactory(){
        rate=1.5;
    }

    public static CurrencyExchangeService getService(){


        return null;
    }
}


/*
package com.acme.conversion.currency.service;

import com.acme.conversion.currency.service.CurrencyExchangeService;

public class CurrencyExchangeServiceFactory
        implements CurrencyExchangeService {
    private double rate;
    public CurrencyExchangeServiceFactory() {
        rate = 1.5;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double requestCurrentRate(String fromCurrency,
                                     String toCurrency) {
        double answer = 0;
        if (fromCurrency.equals("USD") &&
                toCurrency.equals("CDN")) {
            answer = rate;
        }
        if (fromCurrency.equals("CDN") &&
                toCurrency.equals("USD")) {
            answer = 1/rate;
        }
        return answer;
    }
}




/**
 * This factory is responsible for providing a valid currency
 * exchange service upon request.
 */
//public class CurrencyExchangeServiceFactory implements CurrencyExchangeService{

  //  public static CurrencyExchangeService getService() {
        // The body of this method should decide on and return
        // a valid CurrencyExchangeService of some sort.
        // Until we either write one (or are provided one),
        // we can only return null here.
    //    return null;
   // }

//    @Override
  //  public double requestCurrentRate(String fromCurrency, String toCurrency) {
    //    return 0;
   // }
//}
