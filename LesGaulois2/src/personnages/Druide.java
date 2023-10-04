package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom+ " et ma potion peut aller d'une force " + effetPotionMin + " a "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "' " + texte + " '");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obelix"){
				this.parler("Non, Obelix !... Tu n auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}
	public void preparerPotion() {
		Random x=new Random();
		int p=x.nextInt(effetPotionMax);
		if (p<effetPotionMin) {
			this.forcePotion=effetPotionMin;
		}
		else {
		this.forcePotion=p;
		}
		
		if (p>7) {
			this.parler("J'ai prepare une super potion de force");
		}
		else{
			this.parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force "+this.forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix;
		panoramix= new Druide("Panoramix",5,10);
		
		panoramix.preparerPotion();
	}
}
