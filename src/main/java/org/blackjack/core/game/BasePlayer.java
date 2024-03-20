package org.blackjack.core.game;

public class BasePlayer implements Player{

    private final String name;

    public BasePlayer( final String name ) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
