
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class CazadorH implements Clases {

    @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Cazador");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa Ballesta rustica");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 15");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 45");
    }
    
}
