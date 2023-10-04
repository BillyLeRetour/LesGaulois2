package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees;

	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		trophees= new Equipement[100];
	}
	public String getNom() {
		return nom;
	}
	

	public void parler(String texte) {
		System.out.println(prendreParole() + " ' " + texte + "'");
	}
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de "+ romain.getNom());romain.recevoirCoup((force / 3)*this.effetPotion);
//	}
	public void frapper(Romain romain) {
		
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		this.parler(" Merci Druide, je sens que ma force est "+forcePotion+" fois decuplee ");
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="+ effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix;
		asterix =new Gaulois("Asterix",8);
		Romain minus;
		minus=new Romain("Minus",5);
		
		asterix.prendreParole();
		asterix.parler("Bonjour");
		asterix.frapper(minus);
		asterix.boirePotion(5);
		
	}
}
