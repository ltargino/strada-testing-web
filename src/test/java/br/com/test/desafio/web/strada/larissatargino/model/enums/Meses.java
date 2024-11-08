package br.com.test.desafio.web.strada.larissatargino.model.enums;

public enum Meses {
    JANEIRO("January"),
    FEVEREIRO("February"),
    MARCO("March"),
    ABRIL("April"),
    MAIO("May"),
    JUNHO("June"),
    JULHO("July"),
    AGOSTO("August"),
    SETEMBRO("September"),
    OUTUBRO("October"),
    NOVEMBRO("November"),
    DEZEMBRO("December");

    private final String stringValue;

    Meses(final String s) {
        stringValue = s;
    }

    public String toString() {
        return stringValue;
    }
}
