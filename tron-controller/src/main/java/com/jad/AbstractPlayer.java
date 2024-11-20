package com.jad;

import com.jad.tron.IGrid;
import com.jad.tron.ILightCycle;
import com.jad.tron.IPlayer;
import lombok.Getter;
import lombok.Setter;

@Getter
abstract class AbstractPlayer implements IPlayer {
    private final String name;
    @Setter
    private IGrid grid;
    @Setter
    private ILightCycle lightCycle;

    public AbstractPlayer(final String name) {
        this.name = name;
    }
}
