package org.blackjack.core.game.blackjack;

import org.blackjack.core.deck.Card;
import org.blackjack.core.deck.french.enumeration.FrenchCardFigure;
import org.blackjack.core.game.BasePlayer;

import java.util.HashSet;
import java.util.Set;

public class BlackJackPlayer extends BasePlayer {

    private Set<BlackJackCard> hand;

    public BlackJackPlayer(final String name) {
        super(name);
        this.hand = new HashSet<>();
    }

    public void showHand(){
        final StringBuilder builder = new StringBuilder();
        this.hand.forEach( card -> builder.append( card.getSymbol() ).append( " | "));
        final String handString = builder.substring(0, builder.length() - 3 );
        System.out.println( String.format( "%s{ Value: %s, Hand: %s", this.getName(), this.getValue(), handString ) );
    }

    public int getHandSize(){
        return this.hand.size();
    }

    public void clearHand(){
        this.hand.clear();
    }

    public void addCard(final BlackJackCard hand) {
        this.hand.add( hand );
    }

    public int getValue(){
        int result = 0;
        for( final Card card : this.hand ){
            result += card.getValue();
        }
        return result;
    }

    public boolean isBlackJack(){
        return this.hand.size() == 2
                && this.hand.stream().anyMatch(card -> card.getFigure().equals( FrenchCardFigure.AS.getSymbol() ))
                && ( this.hand.stream().anyMatch(card -> card.getFigure().equals( FrenchCardFigure.JACK.getSymbol() ))
                || this.hand.stream().anyMatch(card -> card.getFigure().equals( FrenchCardFigure.QUEEN.getSymbol() ))
                || this.hand.stream().anyMatch(card -> card.getFigure().equals( FrenchCardFigure.KING.getSymbol() )));
    }
}
