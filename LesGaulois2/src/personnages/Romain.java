package personnages;



public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement=0;
	private String texte;

	
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
	

//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		} else {
//			parler("J'abandonne...");
//		}
//	}
	public Equipement[] recevoirCoup(int forceCoup) {
			Equipement[] equipementEjecte = null;
			// precondition
			assert force > 0;
			int oldForce = force;
			forceCoup = calculResistanceEquipement(forceCoup);
			force -= forceCoup;
			// if (force > 0) {
			// parler("A�e");
			// } else {
			// equipementEjecte = ejecterEquipement();
			// parler("J'abandonne...");
			// }
			if(force==0) {parler("A�e");
			}else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				}
			// post condition la force a diminu�e
						assert force < oldForce;
						return equipementEjecte;
			}
			
		
	
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force ducoup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace a mon equipement sa force est diminue de ";
		for (int i = 0; i < nbEquipement;i++) {
			if (equipements[i] != null &&equipements[i].equals(Equipement.Bouclier)) {
						resistanceEquipement += 8;
					} else {
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
					}
				}
				texte += resistanceEquipement + "!";
			}
			parler(texte);
			forceCoup -= resistanceEquipement;
			return forceCoup;
		}
	
	
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[nbEquipement];
			System.out.println("L'equipement de " + nom + "s'envole sous la force du coup.");
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] =equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
			}
			return equipementEjecte;
		}

		

	
	
	
	private void sEquiper(Equipement equipement) {
		
		switch(nbEquipement) {
			case 0:
				nbEquipement=1;
				this.equipements[0]=equipement;
				System.out.println("Le soldat "+this.getNom()+" s'equipe avec un "+equipement+".");
				break;
			case 1:
				if (equipement == equipements[0]) {
					System.out.println("Le soldat "+this.getNom()+" possede deja un "+equipement+" !");
					break;
				}
				else {
					nbEquipement=2;
					this.equipements[1]=equipement;
					System.out.println("Le soldat "+this.getNom()+" s'equipe avec un "+equipement+".");
				}
				break;
			case 2:
				System.out.println("Le soldat "+this.getNom()+" est deja bien protege !");
				break;
			default:
				System.out.println("error");
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
