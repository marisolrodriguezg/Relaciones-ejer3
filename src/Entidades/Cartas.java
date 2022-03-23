
package Entidades;

import Enum.Palo;

public class Cartas {
    private Integer num;
    private Palo palos; 

    public Cartas() {
    }

    public Cartas(Integer num, Palo palos) {
        this.num = num;
        this.palos = palos;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Palo getPalos() {
        return palos;
    }

    public void setPalos(Palo palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Cartas{" + "num=" + num + ", palos=" + palos + '}';
    }

  
    
    
    
}
