package org.blackjack.core.deck.french;

import org.blackjack.core.deck.BaseDeck;
import org.blackjack.core.deck.french.enumeration.FrenchCardFigure;
import org.blackjack.core.deck.french.enumeration.FrenchFrenchSuite;

public class FrenchDeck extends BaseDeck {

    @Override
    public void build() {
        this.deck.clear();
        for( final FrenchCardFigure figure : FrenchCardFigure.values() ){
            for( final FrenchFrenchSuite suite : FrenchFrenchSuite.values() ){
                this.deck.add( new FrenchCard( figure, suite ));
            }
        }
    }

}
