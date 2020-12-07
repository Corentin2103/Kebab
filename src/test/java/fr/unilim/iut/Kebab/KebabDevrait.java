package fr.unilim.iut.Kebab;

import org.junit.Before;
import org.junit.Test;
import static fr.unilim.iut.Kebab.Kebabier.unKebab;
import static org.assertj.core.api.Assertions.assertThat;

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
		kebabAgneau = unKebab()
		 .avec(SALADE)
		 .avec(TOMATE)
		 .avec(OIGNON)
		 .avec(AGNEAU)
		 .avec(PAIN)
		 .avec(SAUCE)
		 .prepareKebab();
	
		kebabVegetarien = unKebab()
				 .avec(SALADE)
				 .avec(TOMATE)
				 .avec(OIGNON)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .prepareKebab();
		
		kebabCrevette = unKebab()
				 .avec(CREVETTE)
				 .avec(TOMATE)
				 .avec(OIGNON)
				 .avec(FROMAGE)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .prepareKebab();
		kebabThon = unKebab()
				 .avec(THON)
				 .avec(FROMAGE)
				 .avec(OIGNON)
				 .avec(PAIN)
				 .avec(SAUCE)
				 .prepareKebab();
	 } 
	@Test
	public void bien_contenir_tous_les_ingredients_ajoutes_pendant_la_preparation() {
		
		
		
		assertThat(kebabAgneau.listerLesIngrédients()).containsExactly(
				SALADE,TOMATE,OIGNON,AGNEAU,PAIN,SAUCE);
		assertThat(kebabVegetarien.listerLesIngrédients()).containsExactly(
				SALADE,TOMATE,OIGNON,PAIN,SAUCE);
		assertThat(kebabThon.listerLesIngrédients()).containsExactly(
				THON,FROMAGE,OIGNON,PAIN,SAUCE);
		assertThat(kebabCrevette.listerLesIngrédients()).containsExactly(
				CREVETTE,TOMATE,OIGNON,FROMAGE,PAIN,SAUCE);
	}
	
	 @Test
	    public void ne_pas_etre_vegetarien_avec_de_l_agneau() {
		 assertThat(kebabAgneau.estVegetarien()).isFalse();
	    }
	    @Test
	    public void ne_pas_etre_vegetarien_avec_de_la_crevette() {
	    	assertThat(kebabCrevette.estVegetarien()).isFalse();
	    }
	    @Test
	    public void ne_pas_etre_vegetarien_avec_du_thon() {
	    	assertThat(kebabThon.estVegetarien()).isFalse();

	    }
	    @Test
	    public void etre_vegetarien_kebabVegetarien() {
	    	assertThat(kebabVegetarien.estVegetarien()).isTrue();
	    }
	
}
