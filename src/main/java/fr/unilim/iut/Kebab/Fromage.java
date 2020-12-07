package fr.unilim.iut.Kebab;

public class Fromage extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
