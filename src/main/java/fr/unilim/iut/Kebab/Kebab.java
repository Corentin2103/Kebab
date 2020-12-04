package fr.unilim.iut.Kebab;

import java.util.List;

public class Kebab {
    private final List<Ingredients> ingredients;

    public Kebab(List<Ingredients> ingredients) {
        this.ingredients=ingredients;
    }

    public List<Ingredients> listeLesIngredients() {
        return this.ingredients;
    }
}
