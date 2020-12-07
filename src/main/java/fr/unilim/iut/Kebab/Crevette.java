package fr.unilim.iut.Kebab;

public class Crevette extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
