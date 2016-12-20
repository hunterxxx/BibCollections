package bibliothek;

import java.util.ArrayList;
import java.util.HashMap;

public class Woerterbuch2 implements Woerterbuch{
    
    HashMap<String, Woerterbucheintrag> buch = new HashMap<String, Woerterbucheintrag>();
    
    public Woerterbuch2(ArrayList<Medium> medien){
        for(Medium media : medien){
            for(String wort : media.getWorte()){
                Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
                buch.put(wort,eintrag);
            }
        }
    }
           
    public Woerterbucheintrag suchen(String wort) {
        if (buch.containsKey(wort)) {
                return buch.get(wort);
            }
        return null;
    }

    public void einfuegen(String wort) {
        Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
        buch.put(wort, eintrag);
    }

    public void loeschen(String wort) {
        if(buch.containsKey(wort)){
            buch.remove(wort);
        }
    }
    
    public void print(){
        //lambda expression Java 8 yea
        buch.forEach((key, value) -> System.out.println(key + " : " + value));
    }    
}
