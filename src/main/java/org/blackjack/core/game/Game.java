package org.blackjack.core.game;

import java.util.List;

public interface Game {

    void play();
    void addPlayers( Player ...players );
    List<Player> getPlayers();

    void results();
}
