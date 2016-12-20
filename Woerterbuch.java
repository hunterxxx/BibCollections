package bibliothek;

public interface Woerterbuch {
    public Woerterbucheintrag suchen(String wort);
    public void einfuegen(String wort);
    public void loeschen(String wort);
    public void print();
}
