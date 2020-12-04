package fr.unilim.iut.Kebab;

import java.util.ArrayList;
import java.util.List;

public class Kebabier {

    private List<Ingredients> ingredients;

    public Kebabier(){
        this.ingredients=new ArrayList();
    }

    public Kebabier avec(Ingredients ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public Kebab preparerLeKebab() {
        return new Kebab(ingredients);
    }
}
