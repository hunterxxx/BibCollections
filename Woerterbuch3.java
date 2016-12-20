package bibliothek;

import java.util.ArrayList;
import java.util.TreeSet;

public class Woerterbuch3 implements Woerterbuch{
    
    TreeSet<Woerterbucheintrag> buch = new TreeSet<Woerterbucheintrag>();
    
    public Woerterbuch3(ArrayList<Medium> medien){
       for(Medium media : medien){
            for(String wort : media.getWorte()){
                Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
                buch.add(eintrag);
            }
        }
    }
    
    public Woerterbucheintrag suchen(String wort) {
        for (Woerterbucheintrag woerterbucheintrag : buch) {
            if (wort.equals(woerterbucheintrag.getWort())) {
                return woerterbucheintrag;
            }
        }
        return null;
    }

    public void einfuegen(String wort) {
        Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
        buch.add(eintrag);
    }

    public void loeschen(String wort) {
        Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
        if(buch.contains(eintrag)){
            buch.remove(eintrag);
        }
    }

    public void print() {
        for(Woerterbucheintrag eintrag : buch){
            System.out.println(eintrag);
        }
    }
    
}
