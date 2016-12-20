package bibliothek;

import java.util.ArrayList;

public class Woerterbuch1 implements Woerterbuch {
    ArrayList<Woerterbucheintrag> buch = new ArrayList<Woerterbucheintrag>();
    
    public Woerterbuch1(ArrayList<Medium> medien){
        //ArrayList<Medium> medienliste = bib.getMedien();
        for(Medium media : medien){
            for(String wort : media.getWorte()){
                Woerterbucheintrag eintrag = new Woerterbucheintrag(wort);
                buch.add(eintrag);
            }
        }
    }
    
    public Woerterbucheintrag suchen(String wort){
        for (Woerterbucheintrag woerterbucheintrag : buch) {
            if (wort.equals(woerterbucheintrag.getWort())) {
                return woerterbucheintrag;
            }
        }
        return null;
    }

    public void einfuegen(String wort) {
        buch.add(new Woerterbucheintrag(wort));
    }

    public void loeschen(String wort) {
        for (Woerterbucheintrag woerterbucheintrag : buch){
            if (wort.equals(woerterbucheintrag.getWort())){
                buch.remove(wort);
                break;
            }
        }
    }

    public void print() {
        for(Woerterbucheintrag woerterbucheintrag : buch){
            System.out.println(woerterbucheintrag);
        }
        //System.out.println(woerterbucheintrag);
    }
    
    
    
}
