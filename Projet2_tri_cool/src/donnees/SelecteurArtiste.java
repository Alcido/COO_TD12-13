package donnees;

public class SelecteurArtiste implements SelecteurCD {
    private String nomArtiste;

    public SelecteurArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }

    public boolean garderCd(CD cd){
        CD cd2 = new CD(nomArtiste, "");
        return cd2.compareToArtiste(cd) == 0;
    }
}