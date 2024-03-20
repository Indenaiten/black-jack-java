package org.blackjack;

import org.blackjack.core.deck.french.FrenchDeck;
import org.blackjack.core.game.Game;
import org.blackjack.core.game.Player;
import org.blackjack.core.game.blackjack.BlackJack;
import org.blackjack.core.game.blackjack.BlackJackPlayer;

public class Application {
    private static final int TOTAL_GAMES = 5;

    public static void main(final String[] args) {
        final Game blackjack = new BlackJack( new FrenchDeck() );

        final Player rick = new BlackJackPlayer( "Rick" );
        final Player morty = new BlackJackPlayer( "Morty" );
        blackjack.addPlayers( rick, morty );

        for( int i = 0 ; i < TOTAL_GAMES ; i++ ){
            System.out.println("--------------------------------------------------");
            System.out.println( String.format( "---| Game %d |---", ( i+ 1 )));
            System.out.println("--------------------------------------------------\n");
            blackjack.play();
            System.out.print("\n");
            blackjack.results();
            System.out.println("\n--------------------------------------------------");
        }

    }
}