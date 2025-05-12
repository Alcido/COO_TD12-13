package donnees;

public class SelecteurAlbum implements SelecteurCD {
    private String nomCd;

    public SelecteurAlbum(String nomCd) {
        this.nomCd = nomCd;
    }

    public boolean garderCd(CD cd){
        CD cd2 = new CD("", nomCd);
        return cd2.compareToArtiste(cd) == 0;
    }
}