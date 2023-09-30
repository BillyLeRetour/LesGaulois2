package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		if (force>0) {this.force = force;}
		else {this.force = 0;}
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[] args) {
		Romain minus;
		minus=new Romain("Minus",6);
		
		minus.prendreParole();
		minus.parler("Bonjour");
		minus.recevoirCoup(2);
		System.out.println(Equipement.Bouclier);
		System.out.println(Equipement.Casque);
		
	}
}
