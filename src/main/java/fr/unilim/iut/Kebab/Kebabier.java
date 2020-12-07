package fr.unilim.iut.Kebab;

import java.util.ArrayList;


public class Kebabier {

	private ArrayList<Ingredients> ingredientArrayList = new ArrayList<>();

    
    public static Kebabier unKebab() {
        return new Kebabier();
    }
    public Kebabier avec(Ingredients ingredient) {
        this.ingredientArrayList.add(ingredient);
        return this;
    }

    public Kebab prepareKebab() {
        return new Kebab(this.ingredientArrayList);
    }

	
}
