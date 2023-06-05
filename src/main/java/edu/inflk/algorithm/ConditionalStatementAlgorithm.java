package edu.inflk.algorithm;

public class ConditionalStatementAlgorithm {

    /*
    // TODO: Entwerfen Sie eine Methode mit einer einseitigen Verzweigung (if):
     */
    private boolean aBoolean = true;
    private boolean bBoolean = false;

    /*
    // TODO: Entwerfen Sie eine Methode mit einer zweiseitigen Verzweigung (if else).
        Benutzen Sie die Attribute der vorherigen Aufgabe.
     */

    /*
    // TODO: Entwerfen Sie eine Methode mit einer mehrseitigen Verzweigung (switch case).
        Verwenden Sie auch eine 'for'- oder 'for-each'-Schleife.
     */

    private Integer[] numbers = {1,2,3,7,23,99,46,23,5};
    
    // Hilfsattribute
    private int[] count = {0,0,0,0};
    
    public void checkIntInput ()
    {
        for(int i = 0; i < numbers.length; i++)
        {
            
            switch(numbers[i])
            {
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                default:
                    count[0]++;
            }
            
        }
        
        for(int i = 0; i < count.length;i++)
        {
            if(i != 0)
            {
                System.out.printf("Die Zahl %s kommt %s Mal vor!%n", i,count[i]);
            } else
            {
                System.out.printf("Sonstige Zahlen kommen %s Mal vor!%n", count[i]);
            }            
        }
    }

}