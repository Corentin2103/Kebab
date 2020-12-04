package fr.unilim.iut.Kebab;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
public class KebabDevrait {

	
	@Test
	public void bien_contenir_tous_les_ingredients_ajoutes_pendant_la_presentation() {
		
		Kebab kebabAgneau =  new Kebabier()
				.avec(new Salade())
				.avec(new Tomate())
				.avec(new Oignon())
				.avec(new Agneau())
				.avec(new Pain())
				.avec(new Sauce())
				.preparerLeKebab();
		
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(
				new Salade(),new Tomate(),new Oignon(),new Agneau(),new Pain(),new Sauce());
	}
}
