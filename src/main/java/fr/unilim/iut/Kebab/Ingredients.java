package fr.unilim.iut.Kebab;

public abstract class Ingredients {

    @Override
    public int hashCode(){
        return 1;
    }
    abstract void accepter(VisiteurDeRegime v);
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
