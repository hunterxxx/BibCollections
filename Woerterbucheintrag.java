package bibliothek;


public class Woerterbucheintrag implements Comparable<Woerterbucheintrag>{
    private String wort;
    private int haufigkeit;
            
    public Woerterbucheintrag(String wort){
        this.wort = wort;
        this.haufigkeit = 1;
    }
    
    public String getWort() {
        return this.wort;
    }

    public int getHaufigkeit() {
        return haufigkeit;
    }
    
    public String toString() {
        return "Wort: " + this.wort + " | Hauefigkeit: " + this.haufigkeit;
    }
    
    public void incHaufigkeit(){
        this.haufigkeit += 1;
    }    

    public int compareTo(Woerterbucheintrag w) {
        if (w.getWort() == null && this.getWort() == null) {
            return 0;
        }
        if (this.getWort() == null) {
            return 1;
        }
        if (w.getWort() == null) {
            return -1;
        }
        return this.getWort().compareTo(w.getWort());
    }
}
