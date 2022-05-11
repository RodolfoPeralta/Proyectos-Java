/*Nos piden hacer una un programa que gestione empleados.
  Los empleados se definen por tener:
Nombre
Edad
Salario
También tendremos una constante llamada PLUS, que tendrá un valor de 300€.
Tenemos dos tipos de empleados: repartidor y comercial.
El comercial, aparte de los atributos anteriores, tiene uno más llamado 
comisión (double).
El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).

Crea sus constructores, getters and setters y toString (piensa como aprovechar 
la herencia).
No se podrán crear objetos del tipo Empleado (la clase padre) pero si de sus hijas.
Las clases tendrán un método llamado plus, que según en cada clase tendrá 
una implementación distinta. Este plus básicamente aumenta el salario del empleado.

En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, 
se le aplicara el plus.
En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.

Crea una clase ejecutable donde crees distintos empleados y le apliques 
el plus para comprobar que funciona.
*/

package paquete1;

import java.util.Scanner;


public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre, zona; int edad; float salario; char opcion, opcion2;
        double comision;
        
        do {
            System.out.print("**Datos empleado**");
            System.out.print("\nNombre: ");
            nombre = entrada.nextLine();
            System.out.print("\nEdad: ");
            edad = entrada.nextInt();
            System.out.print("\nSalario: ");
            salario = entrada.nextFloat();
            System.out.print("\nIndique tipo de Empleado Comercial (c), Repartidor (r): ");
            opcion = entrada.next().charAt(0);
            opcion = Character.toUpperCase(opcion);
            switch(opcion) {
                case 'C':
                    System.out.print("\nComision: ");
                    comision = entrada.nextDouble();
                    Comercial comercial = new Comercial(nombre, edad, salario, comision);
                    comercial.plus();
                    System.out.println(comercial.toString());
                    break;
                case 'R':
                    System.out.print("\nZona: ");
                    zona = entrada.nextLine();
                    Repartidor repartidor = new Repartidor(nombre, edad, salario, zona);
                    repartidor.plus();
                    System.out.println(repartidor.toString());
                    break;
            }
            System.out.print("\nQuiere ingresar otro empleado? (s/n): ");
            opcion2 = entrada.next().charAt(0);
            opcion2 = Character.toUpperCase(opcion2);
            entrada.nextLine();
        } while(opcion2 == 'S');
    }
}
