package org.blackjack.core.deck.french.enumeration;

public enum FrenchFrenchSuite {

    HEARTS( "♥", "Corazones" ),
    DIAMONDS( "♦", "Diamantes" ),
    CLUBS( "♣", "Tréboles" ),
    SPADES( "♠", "Picas" );

    private final String symbol;
    private final String spanishName;

    FrenchFrenchSuite(final String symbol, final String spanishName ) {
        this.symbol = symbol;
        this.spanishName = spanishName;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getSpanishName() {
        return  this.spanishName;
    }
}
