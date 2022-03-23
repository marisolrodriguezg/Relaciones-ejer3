
package relacionesejer3cartas;

import Servicio.ServicioCarta;


public class RelacionesEjer3Cartas {

 
    public static void main(String[] args) {
       ServicioCarta sc=new ServicioCarta();
       sc.crearMazo();
       sc.mostrarMazo();
        System.out.println("++++++++++++++++++++++++++++");
       sc.barajar();
       sc.mostrarMazo();
        System.out.println("++++++++++++++++++++++");
       sc.siguienteCarta();
               System.out.println("++++++++++++++++++++++");
       sc.siguienteCarta();
               System.out.println("++++++++++++++++++++++");
       sc.cartasDisponilbles();
    }
    
}
