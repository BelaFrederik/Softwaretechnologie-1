package stueckliste;

import java.util.Collection;
import java.util.HashSet;

public class Baugruppe extends Bauteil {

    private Collection<Bauteil> bauteile = new HashSet<>();

    public Baugruppe(String id, Bauteil teil) {
        this.id = id;
        bauteile.add(teil);
    }

    public void addBauteil(Bauteil teil) {
        bauteile.add(teil);
    }

    public void removeBauteil(Bauteil teil) {
        bauteile.remove(teil);
    }

    @Override
    public double preis() {
        double preis = 0;
        for (Bauteil teil: this.bauteile) {
            preis += teil.preis();
        }
        return preis;
    }
}