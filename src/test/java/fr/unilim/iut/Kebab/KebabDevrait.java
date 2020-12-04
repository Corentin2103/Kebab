package fr.unilim.iut.Kebab;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;


public class KebabDevrait {

	
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();
	private static final Thon THON = new Thon();
	private static final Fromage FROMAGE = new Fromage();
	private static final Crevette CREVETTE = new Crevette();
	Kebab kebabAgneau;
	Kebab kebabVegetarien;
	Kebab kebabCrevette;
	Kebab kebabThon;
	
	@Before
	public void preparerLesKekabs() {
		kebabAgneau = Kebabier.unKebab()
		 .avec(SALADE)
		 .avec(TOMATE)
		 .avec(OIGNON)
		 .avec(AGNEAU)
		 .avec(PAIN)
		 .avec(SAUCE)
		 .preparerLeKebab();
	
		kebabVegetarien = new Kebabier()
				 .avec(SALADE)
				 .avec(TOMATE)
				 .avec(OIGNON)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .preparerLeKebab();
		
		kebabCrevette = new Kebabier()
				 .avec(CREVETTE)
				 .avec(TOMATE)
				 .avec(OIGNON)
				 .avec(FROMAGE)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .preparerLeKebab();
		kebabThon = new Kebabier()
				 .avec(THON)
				 .avec(FROMAGE)
				 .avec(OIGNON)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .preparerLeKebab();
	 } 
	@Test
	public void bien_contenir_tous_les_ingredients_ajoutes_pendant_la_preparation() {
		
		
		
		assertThat(kebabAgneau.listeLesIngredients()).containsExactly(
				SALADE,TOMATE,OIGNON,AGNEAU,PAIN,SAUCE);
		assertThat(kebabVegetarien.listeLesIngredients()).containsExactly(
				SALADE,TOMATE,OIGNON,PAIN,SAUCE);
		assertThat(kebabThon.listeLesIngredients()).containsExactly(
				THON,FROMAGE,OIGNON,PAIN,SAUCE);
		assertThat(kebabCrevette.listeLesIngredients()).containsExactly(
				CREVETTE,TOMATE,OIGNON,FROMAGE,PAIN,SAUCE);
	}
	@Test
	public void verifier_que_kebab_avec_agneau_n_est_pas_vegetarien() {
		assertThat(kebabAgneau.estVegetarien()).isFalse();
	}
	
}
