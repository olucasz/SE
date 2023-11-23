package Observer;

public class Main {

    public static void main(String[] args) {
        PesoObservable pesoObservable = new PesoObservable();

        ImpressorDePeso impressorDePeso = new ImpressorDePeso();
        LimiteDePeso limiteDePeso = new LimiteDePeso();

        pesoObservable.addObserver(impressorDePeso);
        pesoObservable.addObserver(limiteDePeso);

        pesoObservable.setPeso(3);
        pesoObservable.setPeso(7);
    }
}