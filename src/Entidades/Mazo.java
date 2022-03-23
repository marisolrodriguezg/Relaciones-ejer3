
package Entidades;

import java.util.List;

public class Mazo {
    private List <Cartas>mazo;

    public Mazo() {
    }

    public Mazo(List<Cartas> mazo) {
        this.mazo = mazo;
    }

    public List<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(List<Cartas> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazo=" + mazo + '}';
    }


    
}
