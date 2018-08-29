
package productos;

import deusexmachina.Clases;


public class GuerreroO implements Clases {

   @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es AntiPaladin");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa espada maldita");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 5");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 55");
    }
    
}
