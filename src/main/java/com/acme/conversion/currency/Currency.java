package com.acme.conversion.currency;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Currency {
    private static Set allCurrenciesSet;

    static {
        allCurrenciesSet = new HashSet();
        allCurrenciesSet.add("USD");
        allCurrenciesSet.add("CDN");
    }

    public static Iterator getCurrencies() {
        return allCurrenciesSet.iterator();
    }
}
