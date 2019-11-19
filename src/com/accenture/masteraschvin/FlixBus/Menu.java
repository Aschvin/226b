package com.accenture.masteraschvin.FlixBus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Menu {

    public BusTerminal createTerminal(String name, int numberPlatforms){

        List<Platform> platforms = new ArrayList<>();

        for (int i = 0; i <= numberPlatforms; i++){
            platforms.add(new Platform(i, false));
        }

        BusTerminal terminal = new BusTerminal();

        terminal.setTerminal(name);

        terminal.setPlatforms(platforms);

        return terminal;

    }

}
