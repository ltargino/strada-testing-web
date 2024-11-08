package br.com.test.desafio.web.strada.larissatargino.model.enums;

public enum Country {
    UnitedStatesOfAmerica("United States Of America"),
    SouthAfrica("South Africa");

    private final String stringValue;

    Country(final String s) {
        stringValue = s;
    }

    public String toString() {
        return stringValue;
    }
}
