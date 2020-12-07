package fr.unilim.iut.Kebab;

public class Agneau extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
