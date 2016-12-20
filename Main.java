package bibliothek;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Bibliothek bib = new Bibliothek();
        String[][] medien = BibliothekDB.getMedien();
        for (int i = 0; i < medien.length; i++) {
            String[] m = medien[i];
            String id = m[1];
            String titel = m[2];
            int jahr = Integer.parseInt(m[3]);
            int ausleihen = Integer.parseInt(m[7]);
            Datum datum = new Datum(Integer.parseInt(m[4]), Integer.parseInt(m[5]), Integer.parseInt(m[6]));
            if (m[0] == "CD") {
                String interpret = m[8];
                int laufzeit = Integer.parseInt(m[9]);
                int numtitel = Integer.parseInt(m[10]);
                bib.addMedium(new CD(id, titel, jahr, datum, ausleihen, interpret, numtitel, laufzeit));
            } else if (m[0] == "Film") {
                String format = m[8];
                String genre = m[9];
                String regie = m[10];
                bib.addMedium(new Film(id, titel, jahr, datum, ausleihen, format, regie, genre));
            } else if (m[0] == "Buch") {
                String autor = m[10];
                String isbn = m[8];
                int seiten = Integer.parseInt(m[9]);
                bib.addMedium(new Buch(id, titel, jahr, datum, ausleihen, autor, isbn, seiten));
            }
        }

        // Liste der Medien in der Bibliothek
        ArrayList<Medium> medienliste = bib.getMedien();
        // Liste der (englischen) Stoppworte
        HashSet<String> stoppworte = BibliothekDB.getStoppworte();

        String end = "******************************************************";

        long start1 = System.currentTimeMillis();
        Woerterbuch1 test1 = new Woerterbuch1(medienliste);
        //test1.einfuegen();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        Woerterbuch2 test2 = new Woerterbuch2(medienliste);
        long end2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        Woerterbuch3 test3 = new Woerterbuch3(medienliste);
        long end3 = System.currentTimeMillis();

        System.out.println("Took : " + ((end1 - start1) / 1000));
        System.out.println("Took : " + ((end2 - start2) / 1000));
        System.out.println("Took : " + ((end3 - start3) / 1000));

        System.out.println(stoppworte);
        System.out.println(medienliste);
        //Medium medium = new Medium();
        /* w1 test
                Woerterbuch1 woerterbuch1 = new Woerterbuch1(medienliste);
                woerterbuch1.print();
                String suchwort = "heat";
                System.out.println("Suche nach " + suchwort);
                System.out.println(woerterbuch1.suchen(suchwort) + " gefunden!");
                
                System.out.println(woerterbuch1.suchen("hello") + " gefunden!");

                woerterbuch1.einfuegen("hello");
                System.out.println(woerterbuch1.suchen("hello")+ " gefunden!");
                
                woerterbuch1.loeschen(suchwort);
                System.out.println(woerterbuch1.suchen(suchwort)+ " gefunden!");
                
                end w1 test */
    }

}
