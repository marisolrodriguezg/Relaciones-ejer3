
package Servicio;

import Entidades.Cartas;
import Enum.Palo;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioCarta {
 ArrayList <Cartas> mazoInicial=new ArrayList();
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
 
    public void crearMazo() {

        for (Palo aux : Palo.values()) {
            for (int i = 0; i < 13; i++) {

                if ((i >= 1 && i <= 7) || (i >= 10 && i <= 12)) {
                    Cartas cc = new Cartas();
                    cc.setNum(i);
                    cc.setPalos(aux);
                    mazoInicial.add(cc);
                }
            }
        }
    }

    public void mostrarMazo() {
        for (Cartas aux : mazoInicial) {
            System.out.println(aux);
        }
    }

    public void barajar() {

        Collections.shuffle(mazoInicial);

    }
int cont=0;
    public void siguienteCarta() {
        System.out.println("cartas totales"+ mazoInicial.size());
        String rta;
        System.out.println("quieres una carta?");
        rta = leer.next();
        while (rta.equalsIgnoreCase("si")) {

            if (mazoInicial.size() == 0) {
                System.out.println("no hay  mas cartas");
                break;
            } else {
                for (int i = 0; i < mazoInicial.size(); i++) {
                    System.out.println("carta dada " + mazoInicial.remove(i));
                    cont=cont+1;
                    break;
                }
            }
            System.out.println("quiere otra carta?");
            rta = leer.next();
        }
        
    }
    public void cartasDisponilbles(){
      
       int cartDispo=mazoInicial.size();
       
        System.out.println("cartas disponibles" + cartDispo);
       
    }
    
}


