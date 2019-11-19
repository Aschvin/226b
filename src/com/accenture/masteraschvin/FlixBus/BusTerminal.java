package com.accenture.masteraschvin.FlixBus;

import java.util.List;

public class BusTerminal {

    String terminal;
    List<Platform> platforms;
    Travel travel;

    public BusTerminal() {
    }

    public BusTerminal(String terminal, List<Platform> platforms, Travel travel) {
        this.terminal = terminal;
        this.platforms = platforms;
        this.travel = travel;
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

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
