package personnages;



public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		equipements= new Equipement[2];
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
	private void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
			case 0:
				nbEquipement=1;
				this.equipements[0]=equipement;
				System.out.println("Le soldat "+this.getNom()+" s’equipe avec un "+equipement+".");
				break;
			case 1:
				if (equipement == equipements[0]) {
					System.out.println("Le soldat "+this.getNom()+" possède déjà un "+equipement+" !");
					break;
				}
				else {
					nbEquipement=2;
					this.equipements[1]=equipement;
					System.out.println("Le soldat "+this.getNom()+" s’equipe avec un "+equipement+".");
				}
				break;
			case 2:
				System.out.println("Le soldat "+this.getNom()+" est déjà bien protégé !");
				break;
		}
	}
	public static void main(String[] args) {
		Romain minus;
		minus=new Romain("Minus",6);
		
		minus.prendreParole();
		minus.parler("Bonjour");
		minus.recevoirCoup(2);

		minus.sEquiper(Equipement.Casque);
		minus.sEquiper(Equipement.Casque);
		minus.sEquiper(Equipement.Bouclier);
		minus.sEquiper(Equipement.Bouclier);
		
	}
}
