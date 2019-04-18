package com.javalesson.oop;

public enum Size {

    SUPER_SMALL("XS"), SMALL("S"), MEDIUM("M"), BIG("L"), EXTRA_BIG("XL"), UNDEFINED("");

    private String abbrev;

    Size(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAbbrev() {
        return abbrev;
    }
}
