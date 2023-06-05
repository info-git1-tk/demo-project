package edu.inflk.algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class Foreach {

    protected int index;
    protected int index0;

    public void loopThrough(String[] map, Runnable method)
    {
        for (String item: map
             ) {
            method.run();
        }

    }

}
