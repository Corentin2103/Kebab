package fr.unilim.iut.Kebab;

public class Pain extends Ingredients{
	@Override
    void accepter(VisiteurDeRegime v) {
        v.visiter(this);
    }
}
