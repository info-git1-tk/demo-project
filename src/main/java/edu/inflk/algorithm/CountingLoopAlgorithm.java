package edu.inflk.algorithm;

public class CountingLoopAlgorithm {

    /*
    // TODO: Entwerfen Sie eine Methode mit einer Zählschleife (for):
     */
    private String[] words = {"Das","Treptow-Kolleg","ist","ein", "Institut","zur","Erlangung","der","Hochschulreife"};

    
    private Integer[] numbers = {1,2,3,7,23,99,46,23};
    
    private String name = "";
    private String instanz = "";
    private String aufgabe = "";
     private String notfound = "";
    
    /*
    // TODO: Entwerfen Sie eine Methode mit einer Schleife (for each):
     */
    
        public void foundwords (){
            for(int i=0;i<words.length;i++){
                switch(words[i]){
                    case "Treptow-Kolleg":
                        name = words[i];
                        break;
                    case "Institut":
                        instanz = words[i];
                        break;
                    case "Hochschulreife":
                        aufgabe = words[i];
                        break;
                    default: 
                        notfound = "Zeichenkette nicht gefunden!";
                        
                }
            
            }
                    
     }
}
