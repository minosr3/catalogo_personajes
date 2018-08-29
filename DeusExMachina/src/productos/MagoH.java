
package productos;

import deusexmachina.Clases;

public class MagoH implements Clases 
{
    @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es sacerdote");
    }

    @Override
    public void AsignarArma() {
        System.out.println("Se equipa varita se sauco");
    }

    @Override
    public void AsignarMana() {
        System.out.println("El mana inicial es 35");
    }

    @Override
    public void AsignarHp() {
     System.out.println("El Hp inicial es 25");
    }

    
}
