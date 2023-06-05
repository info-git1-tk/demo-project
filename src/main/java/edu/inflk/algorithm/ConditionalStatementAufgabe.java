package edu.inflk.algorithm;

public class ConditionalStatementAufgabe extends Aufgabe
{

    @Override
    public String doTask() {
        for (int i = 0; i < stringCollection.length; i++) {
            output.append(stringCollection[i]);
            if(i < stringCollection.length-1)
            {
                output.append(" ");
            } else
            {
                output.append(".");
            }
        }
        return output.toString();
    }

}
