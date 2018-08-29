/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import deusexmachina.Clases;

/**
 *
 * @author overkill
 */
public class MagoO implements Clases {

    @Override
    public void AsignarClase() {
        System.out.println("la clase asignada es Mago de guerra");
    }

    @Override
    public void AsignarArma() {
        System.out.println("se equipa baculo de craneo");
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
