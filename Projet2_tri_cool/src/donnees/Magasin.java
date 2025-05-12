package donnees;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public int getNbCD() {
		return listeCds.size();
	}

//	public void trierArtiste() {
//
//		ArrayList<CD> copieCD = new ArrayList<CD>(listeCds);
//		ArrayList<CD> listeFin = new ArrayList<CD>();
//
//		while (!copieCD.isEmpty()) {
//			CD minCD = copieCD.get(0);
//			for (CD cd : copieCD) {
//				if (cd.compareToArtiste(minCD) < 0) {
//					minCD = cd;
//				}
//			}
//			listeFin.add(minCD);
//			copieCD.remove(minCD);
//		}
//		listeCds = listeFin;
//	}
//
//	public void trierAlbum() {
//
//		ArrayList<CD> copieCD = new ArrayList<CD>(listeCds);
//		ArrayList<CD> listeFin = new ArrayList<CD>();
//
//		while (!copieCD.isEmpty()) {
//			CD minCD = copieCD.get(0);
//			for (CD cd : copieCD) {
//				if (cd.compareToTitre(minCD) < 0) {
//					minCD = cd;
//				}
//			}
//			listeFin.add(minCD);
//			copieCD.remove(minCD);
//		}
//		listeCds = listeFin;
//	}

	public void tri(ComparateurCD comp) {
		ArrayList<CD> copieCD = new ArrayList<CD>(listeCds);
		ArrayList<CD> listeFin = new ArrayList<CD>();

		while (!copieCD.isEmpty()) {
			CD minCD = copieCD.get(0);
			for (CD cd : copieCD) {
				if (comp.etreAvant(cd,minCD)) minCD = cd;
			}
			listeFin.add(minCD);
			copieCD.remove(minCD);
		}
		listeCds = listeFin;
	}

	public ArrayList<CD> chercher(String nom) {
		ArrayList<CD> listCD = new ArrayList<>();
		SelecteurArtiste art = new SelecteurArtiste(nom);
		for (CD cd : listeCds) {
			if (art.garderCd(cd)) listCD.add(cd);
		}
		return listCD;
	}

}
