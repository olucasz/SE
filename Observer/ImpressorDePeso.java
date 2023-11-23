package Observer;

import java.util.Observable;
import java.util.Observer;

public class ImpressorDePeso implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Novo peso: " + ((PesoObservable) o).getPeso());
    }

    
}