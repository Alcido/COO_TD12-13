package test;

import XML.ChargeurMagasin;
import donnees.Magasin;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MagasinTest {
    @org.junit.jupiter.api.Test
    void test_chargerMag_OK() throws Exception{
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        Magasin m = cm.chargerMagasin();

        int i = m.getNbCD();

        assertEquals(12, i, "Est ce que le nombre de CD est correct ?");
    }

    @org.junit.jupiter.api.Test
    void test_chargerMag_PasOK(){
        ChargeurMagasin cm = new ChargeurMagasin("untrucbidon");
        boolean b = true;
        try {
            Magasin m = cm.chargerMagasin();
        }catch(IOException e){
            b = false;
        }

        assertFalse(b, "Une erreur doit survenir !");
    }
}