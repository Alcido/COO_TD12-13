package donnees;

public class ComparateurAlbum implements ComparateurCD {


    public boolean etreAvant(CD cd1, CD cd2) {
        return (cd1.compareToTitre(cd2) < 0);
    }
}
