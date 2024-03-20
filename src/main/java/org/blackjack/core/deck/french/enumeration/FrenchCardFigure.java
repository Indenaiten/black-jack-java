package org.blackjack.core.deck.french.enumeration;

public enum FrenchCardFigure {

    AS( "A", 1, "as" ),
    TWO( "2", 2, "dos" ),
    THREE( "3", 3, "tres" ),
    FOUR( "4", 4, "cuatro" ),
    FIVE( "5", 5, "cinco" ),
    SIX( "6", 6, "seis" ),
    SEVEN( "7", 7, "siete" ),
    EIGHT( "8", 8, "ocho" ),
    NINE( "9", 9, "nueve" ),
    TEN( "10", 10, "diez" ),
    JACK( "J", 11, "jota" ),
    QUEEN( "Q", 12, "reina" ),
    KING( "K", 13, "rey" );

    private final String symbol;
    private final int value;
    private final String spanishName;

    FrenchCardFigure(final String symbol, final int value, final String spanishName ) {
        this.symbol = symbol;
        this.value = value;
        this.spanishName = spanishName;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    public String getSpanishName() {
        return  this.spanishName;
    }

}
