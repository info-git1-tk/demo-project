package edu.inflk;


import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        String[] list = {"a","b","c","d"};

        Iterator<String> iterator = Arrays.stream(list).iterator();

        do {
            String current = iterator.next();
            System.out.println("Wert = " + current);
        }

        while (iterator.hasNext());

        iterator = Arrays.stream(list).iterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println("Wert = " + current);
        }

        boolean i = false;

        System.out.println("Beginn der While-Schleife");
        while (!i) {
            System.out.println(i);
            i = true;
        }
        System.out.println();

        System.out.println("Beginn der Do-While-Schleife");
        do {
            System.out.println(i);
            i = !i;
        }
        while (!i);

    }

    // Neue Funktionen etablieren

    // Hier gibts was cooles

    // Und noch etwas Neues!

}