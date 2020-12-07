package fr.unilim.iut.Kebab;

public interface VisiteurDeRegime {
    boolean visiter(Pain pain);
    boolean visiter(Agneau agneau);
    boolean visiter(Thon thon);
    boolean visiter(Crevette crevette);
    boolean visiter(Fromage fromage);
    boolean visiter(Oignon oignon);
    boolean visiter(Salade salade);
    boolean visiter(Tomate tomate);
    boolean visiter(Sauce sauce);
}

