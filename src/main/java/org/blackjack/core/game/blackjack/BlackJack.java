package org.blackjack.core.game.blackjack;

import org.blackjack.core.deck.Card;
import org.blackjack.core.deck.french.FrenchCard;
import org.blackjack.core.deck.french.FrenchDeck;
import org.blackjack.core.game.BaseGame;
import org.blackjack.core.game.Player;

import java.util.*;

public class BlackJack extends BaseGame {

    private FrenchDeck deck;
    private Map<BlackJackPlayer, BlackJackPlayer> bank;

    public BlackJack(final FrenchDeck deck) {
        this.deck = deck;
    }

    @Override
    public void play() {
        this.deck.build();
        this.bank = new HashMap<>();
        final List<Player> players = this.getPlayers();
        for( final Player player : players ){
            final BlackJackPlayer blackJackPlayer = (BlackJackPlayer) player;
            blackJackPlayer.clearHand();
            final BlackJackPlayer bank = new BlackJackPlayer( "Bank" );
            this.bank.put(blackJackPlayer, bank);
            this.runTurn( blackJackPlayer );
            blackJackPlayer.showHand();
            bank.showHand();
        }
    }

    @Override
    public void results() {
        for( final Map.Entry<BlackJackPlayer, BlackJackPlayer> entry : this.bank.entrySet() ){
            final BlackJackPlayer player = entry.getKey();
            final BlackJackPlayer bank = entry.getValue();
            if( player.isBlackJack() ){
                System.out.println( String.format( "%s: BlackJack !", player.getName() ));
            }
            else if( bank.isBlackJack() ){
                System.out.println( "Banca: BlackJack !" );
            }
            else if( player.getValue() <= 21 && player.getValue() > bank.getValue() ){
                System.out.println(String.format( "%s: Winner !", player.getName() ));
            }
            else{
                System.out.println( "Banca: Winner !" );
            }
        }
    }

    private void runTurn(final BlackJackPlayer player ){
        final BlackJackPlayer bank = this.bank.get( player );
        this.deal( player );
        this.deal( bank );
    }

    private void deal( final BlackJackPlayer player ){
        boolean playerTurnIsFinish = false;
        do{
            List<Card> cards;
            try{
                cards = this.deck.drow(1);
            } catch ( final IllegalStateException e ){
                this.deck.build();
                cards = this.deck.drow(1);
            }

            final BlackJackCard blackJackCard = new BlackJackCard((FrenchCard) cards.get(0));
            player.addCard(blackJackCard);
            if( player.getValue() > 21 || player.getHandSize() > 1 ){
                playerTurnIsFinish = true;
            }
        }while( !playerTurnIsFinish );
    }
}
