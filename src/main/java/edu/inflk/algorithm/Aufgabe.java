package edu.inflk.algorithm;

import edu.inflk.interfaces.AlgorithmInterface;

public abstract class Aufgabe implements AlgorithmInterface {

    StringBuilder output = new StringBuilder();

    public String toString()
    {
        return doTask();
    }

}
