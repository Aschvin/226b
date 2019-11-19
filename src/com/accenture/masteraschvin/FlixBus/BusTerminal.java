package com.accenture.masteraschvin.FlixBus;

import java.util.List;

public class BusTerminal {

    String terminal;
    List<Platform> platforms;

    public BusTerminal(String terminal, List<Platform> platforms) {
        this.terminal = terminal;
        this.platforms = platforms;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }
}
