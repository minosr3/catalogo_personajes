package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class MagoE implements Clases {

    @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Druida");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa Grimorio de trebol de 4 hojas");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 40");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 20");
    
}
}