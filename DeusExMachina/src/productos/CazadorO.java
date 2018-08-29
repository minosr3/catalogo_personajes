
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class CazadorO implements Clases{

     @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Exterminador");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa Arco largo");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 10");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 50");
    }
    
}
