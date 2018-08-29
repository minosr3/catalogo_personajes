
package productos;

import deusexmachina.Clases;

public class CazadorE  implements Clases{

     @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Explorador");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa arco de abedul");
    }

    @Override
    public void AsignarMana() {
       System.out.println("el mana inicial es 30");
    }

    @Override
    public void AsignarHp() {
        System.out.println("El Hp inicial es 30");
    }
    
}
