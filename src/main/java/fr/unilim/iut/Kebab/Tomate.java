package fr.unilim.iut.Kebab;

public class Tomate extends Ingredients{
	 @Override
	    void accepter(VisiteurDeRegime v) {
	        v.visiter(this);
	    }
}
