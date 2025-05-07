package donnees;

import XML.ChargeurCD;
import XML.ChargeurMagasin;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MagasinTest {

    @org.junit.jupiter.api.Test
    void trierArtiste_test() throws FileNotFoundException {
        //init données
        ChargeurMagasin charg = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = charg.chargerMagasin();
        CD cd1 = new CD("Justin Bieber", "Believe");
        CD cd2 = new CD("Whitney Houston","Whitney Houston");

//        ChargeurCD chargcd = new ChargeurCD("musicbrainzSimple/Bieber_Believe.xml");
//        CD cd1 = chargcd.chargerCD();
//
//        chargcd = new ChargeurCD("musicbrainzSimple/Houston_Houston.xml");
//        CD cd2 = chargcd.chargerCD();
        //appel méthode
        mag.trierAlbum();
        //verif
        assertEquals(mag.getCd(0), cd1);
        assertEquals(mag.getCd(11), cd2);

    }

    @org.junit.jupiter.api.Test
    void trierAlbum_test() throws FileNotFoundException {
        //init données
        ChargeurMagasin charg = new ChargeurMagasin("musicbrainzSimple/");
        Magasin mag = charg.chargerMagasin();
        CD cd1 = new CD("Bénabar", "Bénabar");
        CD cd2 = new CD("Zebda","Essence ordinaire");

        //appel méthode
        mag.trierArtiste();
        //verif
        assertEquals(mag.getCd(0), cd1);
        assertEquals(mag.getCd(11), cd2);
    }
}