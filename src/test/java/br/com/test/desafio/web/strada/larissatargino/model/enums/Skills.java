package br.com.test.desafio.web.strada.larissatargino.model.enums;

public enum Skills {
    APIs("APIs"),
    CSS("CSS");

    private final String stringValue;

    Skills(final String s) {
        stringValue = s;
    }

    public String toString() {
        return stringValue;
    }

}
