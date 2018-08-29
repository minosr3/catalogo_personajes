
package deusexmachina;

import fabricas.FabricaCazadorE;
import fabricas.FabricaCazadorH;
import fabricas.FabricaCazadorO;
import fabricas.FabricaGuerreroElf;
import fabricas.FabricaGuerreroH;
import fabricas.FabricaGuerreroO;
import fabricas.FabricaMagoE;
import fabricas.FabricaMagoH;
import fabricas.FabricaMagoO;
import java.util.Scanner;


/**
 *
 * @author overkill
 */
public class DeusExMachina {
    private static Scanner S = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int o;
        do{
            o = PreguntarCreacion();
            switch(o) {
                case 1:
                    Stats(new FabricaMagoH());
                    break;
                case 2:
                    Stats(new FabricaGuerreroH());
                    break;
                case 3:
                    Stats(new FabricaCazadorH());
                    break;
                case 4:
                    Stats(new FabricaMagoE());
                    break;
                case 5: 
                    Stats (new FabricaGuerreroElf());
                    break;
                case 6: 
                    Stats (new FabricaCazadorE());
                    break;
                case 7: 
                    Stats (new FabricaMagoO());
                    break;
                case 8: 
                    Stats (new FabricaGuerreroO());
                    break;
                case 9: 
                    Stats (new FabricaCazadorO());
                    break;
                case 10: 
                    System.out.print ("kill");
                    break;
                default:
                    System.out.println("Se ha ingresado una opción inválida.");
            }
            System.out.print("\n");
        }while(o!=10);
    }
    
        public static void Stats(Fabrica factory) {
        Clases clase = factory.CrearClase();
        clase.AsignarClase();
        clase.AsignarArma();
        clase.AsignarMana();
        clase.AsignarHp();
    }
      public static int PreguntarCreacion() {
        System.out.print(
                
                "Menu De Creacion\n"
              + "1. Crear humano mago.\n"
              + "2. Crear humano guerrero.\n"
              + "3. Crear humano cazador.\n"
              + "4. Crear elfo mago.\n"
              + "5. Crear elfo guerrero.\n"
              + "6. Crear elfo cazador.\n"
              + "7. Crear orco mago.\n"
              + "8. Crear orco guerrero.\n"
              + "9. Crear orco cazador.\n"
              + "10. Cerrar programa.\n"
              + "Seleccione opción: "
              
        );
        return Integer.parseInt( S.nextLine() );
    }
  }
    

