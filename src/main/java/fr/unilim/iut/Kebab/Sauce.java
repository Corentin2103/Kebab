package fr.unilim.iut.Kebab;

public class Sauce extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
