package com.acme.conversion.currency.service;

/**
 * This interface defines the standard API for all currency
 * exchange services. All currency exchange service, regardless
 * of implementation, will adhere to this interface.
 */
public interface CurrencyExchangeService {
    /**
     * Requests the current exchange rate from one currency
     * to another.
     * @param fromCurrency the original currency
     * @param toCurrency the 'destination' or final currency
     * @return the currency exchange rate
     */
    static double requestCurrentRate(String fromCurrency, String toCurrency){
        return 0;
    };
}
