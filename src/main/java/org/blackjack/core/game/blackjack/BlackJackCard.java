package org.blackjack.core.game.blackjack;

import org.blackjack.core.deck.Card;
import org.blackjack.core.deck.french.FrenchCard;
import org.blackjack.core.deck.french.enumeration.FrenchCardFigure;

import java.util.HashMap;
import java.util.Map;

public class BlackJackCard implements Card {

    private final Map<FrenchCardFigure, Integer> values;
    private final FrenchCard card;

    public BlackJackCard(final FrenchCard card ) {
        this.card = card;
        this.values = new HashMap<>();
        this.values.put( FrenchCardFigure.AS, 11 );
        this.values.put( FrenchCardFigure.TWO, 2 );
        this.values.put( FrenchCardFigure.THREE, 3 );
        this.values.put( FrenchCardFigure.FOUR, 4 );
        this.values.put( FrenchCardFigure.FIVE, 5 );
        this.values.put( FrenchCardFigure.SIX, 6 );
        this.values.put( FrenchCardFigure.SEVEN, 7 );
        this.values.put( FrenchCardFigure.EIGHT, 8 );
        this.values.put( FrenchCardFigure.NINE, 9 );
        this.values.put( FrenchCardFigure.TEN, 10 );
        this.values.put( FrenchCardFigure.JACK, 10 );
        this.values.put( FrenchCardFigure.QUEEN, 10 );
        this.values.put( FrenchCardFigure.KING, 10 );
    }

    @Override
    public String getName() {
        return this.card.getName();
    }

    @Override
    public String getFigure() {
        return this.card.getFigure();
    }

    @Override
    public String getSuit() {
        return this.card.getSuit();
    }

    @Override
    public String getSymbol() {
        return this.card.getSymbol();
    }

    @Override
    public int getValue() {
        return this.values.getOrDefault(this.card.getFigureAsEnum(), 0);
    }
}
