package org.blackjack.core.deck;

import java.util.*;

public abstract class BaseDeck implements Deck{

    protected final Set<BaseCard> deck;

    public BaseDeck() {
        this.deck = new HashSet<>();
        this.build();
    }

    public abstract void build();

    @Override
    public List<Card> drow(final int x) {
        if (this.deck.size() < x) {
            throw new IllegalStateException("Deck is empty !");
        }

        final Set<Card> result = new HashSet<>();
        final Random rand = new Random();
        for( int i = 0 ; i < x ; i++ ){
            List<Card> deckTmp = new ArrayList<>(this.deck);
            int index = rand.nextInt(deckTmp.size());
            final Card card = deckTmp.get( index );
            this.deck.remove(card);
            result.add(card);
        }

        return new ArrayList<>(result);
    }
}
