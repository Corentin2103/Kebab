package fr.unilim.iut.Kebab;

public class Oignon extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
