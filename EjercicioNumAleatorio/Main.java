/*  Pide por teclado dos número y genera un número aleatorio 
entre esos números. Usa el método Math.random para generar un número 
entero aleatorio (recuerda el casting de double a int).
*/

package Paquete1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    
    static public int numeroRandom(int numero1, int numero2) {
        
        int aleatorio = (int)Math.floor(Math.random()*(numero1-numero2)+numero2);
        
        return aleatorio;
        
    }

    public static void main(String[] args) {
        int numero1, numero2;
        
        //Pido dos numeros enteros
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero: "));
        
        //Llamo al metodo para generar un numero entre el intervalo dado
        JOptionPane.showMessageDialog(null, "El numero aleatorio entre" + numero1 + " y " + numero2 + " es: "+numeroRandom(numero1, numero2));
        
        
    }
}
