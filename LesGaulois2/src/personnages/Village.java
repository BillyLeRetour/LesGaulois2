package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVM) {
		this.nom = nom;
		this.nbVillageoisMaximum=nbVM;
		villageois= new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+this.chef+" vivent les legendaire gaulois :");
		for (int i=0; i<nbVillageois;i++) {
				System.out.println("-"+trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		//Gaulois gaulois = village.trouverHabitant(30);
		//le village va jusqu'a 29
		Village village;
		village=new Village("Village des Irreductibles ",30);
		Gaulois asterix;
		asterix =new Gaulois("Asterix",8);
		Gaulois obelix;
		obelix =new Gaulois("Obelix",25);
		
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
        //Gaulois gaulois = village.trouverHabitant(1);
        //System.out.println(gaulois);
		//Ca commence a 0
		village.afficherVillageois();
	}
}
