package fr.unilim.iut.Kebab;

import java.util.List;
import java.util.ArrayList;

public class Kebab {
	private static final Agneau AGNEAU = new Agneau();
	private static final Thon THON = new Thon();
	private static final Crevette CREVETTE = new Crevette();
	private static final Fromage FROMAGE = new Fromage();
	private ArrayList<Ingredients> ingredients;

    public Kebab(List<Ingredients> ingredients) {
        this.ingredients = (ArrayList<Ingredients>) ingredients;
    }

    public List<Ingredients> listerLesIngrédients() {
        return this.ingredients;
    }

    public boolean estVegetarien() {
    
	if(this.ingredients.contains(AGNEAU)|| this.ingredients.contains(CREVETTE)|| this.ingredients.contains(THON)) {
        return false;
    }else {
    	return true;
    }
    }
    public boolean estPescarien() {
    	if(this.ingredients.contains(AGNEAU)
    			|| this.ingredients.contains(CREVETTE)
    			|| this.ingredients.contains(THON)
    			|| this.ingredients.contains(FROMAGE)) {
            return false;
        }else {
        	return true;
        }
    }
}
