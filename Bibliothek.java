package bibliothek;

import java.util.ArrayList;

public class Bibliothek {

    private ArrayList<Medium> medien;

    //TreeSet
    //-Objects are stored in a sorted and ascending order.
    //-retrieval times are quite fast
    private Woerterbuch3 book;

    public Bibliothek() {
        this.medien = new ArrayList<Medium>();
        this.book = new Woerterbuch3(medien);
    }

    public ArrayList<Medium> getMedien() {
        return this.medien;
    }

    public void addMedium(Medium m) {
        this.medien.add(m);
        for (String wort : m.getWorte()) {
            this.book.einfuegen(wort);
        }
    }

    public Woerterbuch3 getBook() {
        return book;
    }
}
