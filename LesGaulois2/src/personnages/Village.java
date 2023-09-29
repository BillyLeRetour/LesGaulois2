package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois[] Villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVM) {
		this.nom = nom;
		this.nbVillageoisMaximum=nbVM;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.Villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return Villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef"+this.chef+"vivent les légendaire gaulois :");
		System.out.println("-"+trouverHabitant(0)+"\n");
	}
	
	public static void main(String[] args) {
		//Gaulois gaulois = village.trouverHabitant(30);
		//le village va jusqu'a 29
		Village village;
		village=new Village("“Village des Irréductibles ",30);
		Gaulois asterix;
		asterix =new Gaulois("Asterix",8);
		
		village.ajouterHabitant(asterix);
	}
}
