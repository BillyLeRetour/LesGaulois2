package histoire;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix;
		asterix =new Gaulois("Asterix",8);
		Gaulois obelix;
		obelix =new Gaulois("Obelix",10);
		Romain minus;
		minus=new Romain("Minus",6);
		Druide panoramix;
		panoramix= new Druide("Panoramix",5,10);
		
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

	}
}
