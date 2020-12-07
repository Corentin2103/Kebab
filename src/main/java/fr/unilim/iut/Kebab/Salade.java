package fr.unilim.iut.Kebab;

public class Salade extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
