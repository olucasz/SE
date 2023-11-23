package Observer;

import java.util.Observable;
import java.util.Observer;

public class LimiteDePeso implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        double peso = ((PesoObservable) o).getPeso();

        if (peso > 5) {
            System.out.println("O peso está acima do limite de 5kg.");
        } else {
            System.out.println("O peso está dentro do limite de 5kg.");
        }
    }
}