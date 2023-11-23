package Observer;

import java.util.Observable;

public class PesoObservable extends Observable {

    private double peso;

    public PesoObservable() {
        this.peso = 0;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setChanged();
        notifyObservers();
    }
}