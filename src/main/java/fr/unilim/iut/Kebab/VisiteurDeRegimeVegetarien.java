package fr.unilim.iut.Kebab;

public class VisiteurDeRegimeVegetarien implements VisiteurDeRegime {

    @Override
    public boolean visiter(Pain pain) {
        return true;
    }

    @Override
    public boolean visiter(Agneau agneau) {
        return false;
    }

    @Override
    public boolean visiter(Thon thon) {
        return false;
    }

    @Override
    public boolean visiter(Crevette crevette) {
        return false;
    }

    @Override
    public boolean visiter(Fromage fromage) {
        return true;
    }

    @Override
    public boolean visiter(Oignon oignon) {
        return true;
    }

    @Override
    public boolean visiter(Salade salade) {
        return true;
    }

    @Override
    public boolean visiter(Tomate tomate) {
        return true;
    }

    @Override
    public boolean visiter(Sauce sauce) {
        return true;
    }
}