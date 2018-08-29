
package productos;

import deusexmachina.Clases;

public class GuerreroE implements Clases {

   @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Aladid");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa Crissaegrim");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 20");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 40");
    }
    
}
