package org.blackjack.core.deck;

public abstract class BaseCard implements Card{
    private final String figure;
    private final String suit;
    private final String symbol;
    private final int value;

    public BaseCard(final String figure, final String suit, final int value){
        this.figure = figure;
        this.suit = suit;
        this.symbol = this.figure.concat(this.suit);
        this.value = value;
    }

    @Override
    public String getFigure() {
        return this.figure;
    }

    @Override
    public String getSuit() {
        return this.suit;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
