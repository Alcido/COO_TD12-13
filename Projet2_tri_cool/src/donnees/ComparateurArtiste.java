package donnees;

public class ComparateurArtiste implements ComparateurCD {

    public boolean etreAvant(CD cd1, CD cd2) {
        return (cd1.compareToArtiste(cd2) < 0);
    }

}
