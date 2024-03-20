package org.blackjack.core.deck.french;

import org.blackjack.core.deck.BaseCard;
import org.blackjack.core.deck.french.enumeration.FrenchCardFigure;
import org.blackjack.core.deck.french.enumeration.FrenchFrenchSuite;

public class FrenchCard extends BaseCard {

    private final String name;
    private final FrenchCardFigure figure;
    private final FrenchFrenchSuite suite;

    public FrenchCard(final FrenchCardFigure figure, final FrenchFrenchSuite suite) {
        super(figure.getSymbol(), suite.getSymbol(), 0);
        this.figure = figure;
        this.suite = suite;
        this.name = String.format("%s de %s", this.figure.getSpanishName(), this.suite.getSpanishName());
    }

    @Override
    public String getName() {
        return this.name;
    }

    public FrenchCardFigure getFigureAsEnum() {
        return this.figure;
    }

    public FrenchFrenchSuite getSuiteAsEnum() {
        return this.suite;
    }
}
