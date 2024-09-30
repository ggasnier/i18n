package com.guillaumegasnier.i18n;

import java.util.Locale;

/**
 * @author Guillaume GASNIER
 */
public enum CountryCode {

    FR(Alpha3.FRA, "France");

    private final Alpha3 alpha3;
    private final String countryName;

    CountryCode(Alpha3 alpha3, String countryName) {
        this.alpha3 = alpha3;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getCountryName(Locale locale) {
        if (locale == null) return this.countryName;
        return locale.getDisplayCountry();
    }

    public enum Alpha3 {

        FRA
    }

}