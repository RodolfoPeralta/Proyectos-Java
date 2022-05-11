/* Clase Password: genera contraseñas aleatorias e indica si es fuerte.
Para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula 
y mas de 5 números.
*/

package Paquete1;

import java.util.Scanner;


public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char opcion; int longitud, cantContraseñas;
        
        System.out.print("\nCuantas contraseñas desea crear?: ");
        cantContraseñas = entrada.nextInt();
        
        //Creo un array que almacena si es fuerte o no cada una de las contraseñas
        boolean fuertes[] = new boolean[cantContraseñas];
        
        System.out.print("\nDesea indicar la longitud de la contraseña? (s/n): ");
        opcion = entrada.next().charAt(0);
        
        if(opcion == 's') {
            System.out.print("Ingrese longitud: ");
            longitud = entrada.nextInt();
            Password contraseñas[] = new Password[cantContraseñas];
            for(int i=0; i<cantContraseñas; i++) {
                contraseñas[i] = new Password(longitud);
                fuertes[i] = contraseñas[i].esFuerte();
                System.out.println(contraseñas[i].getContraseña()+" "+fuertes[i]);
            }
        }
        else if(opcion == 'n') {
            Password contraseñas[] = new Password[cantContraseñas];
            for(int i=0; i<cantContraseñas; i++) {
                contraseñas[i] = new Password();
                fuertes[i] = contraseñas[i].esFuerte();
                System.out.println(contraseñas[i].getContraseña()+" "+fuertes[i]);
            }    
        }
    }
}
