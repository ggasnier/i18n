package com.guillaumegasnier.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryCodeTest {

    @Test
    void getCountryName() {

        CountryCode countryCode = CountryCode.FR;
        assertEquals("France", countryCode.getCountryName(null));
        assertEquals("France", countryCode.getCountryName());


        assertEquals("France", countryCode.getCountryName(Locale.FRANCE));
    }
}