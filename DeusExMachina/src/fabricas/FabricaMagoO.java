/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import deusexmachina.Clases;
import deusexmachina.Fabrica;
import productos.MagoO;


public class FabricaMagoO implements Fabrica {

    @Override
    public Clases CrearClase() {
        return new MagoO();
    }
 
    
    
}
