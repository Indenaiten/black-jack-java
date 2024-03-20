package org.blackjack.core.game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class BaseGame implements Game{

    private Set<Player> playerList;

    public BaseGame() {
        this.playerList = new HashSet<>();
    }

    @Override
    public void addPlayers(final Player... players) {
        this.playerList.addAll(Set.of(players));
    }

    @Override
    public List<Player> getPlayers() {
        return new ArrayList<>(this.playerList);
    }
}
