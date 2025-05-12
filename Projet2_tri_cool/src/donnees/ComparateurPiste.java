package donnees;

public class ComparateurPiste implements ComparateurCD {
    public boolean etreAvant(CD cd1, CD cd2) { return cd1.compareToPiste(cd2);};
}
