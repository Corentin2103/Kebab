package fr.unilim.iut.Kebab;

public class Thon extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
