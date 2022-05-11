
package paquete1;


public class Repartidor extends Empleado {
    
    //Atributos
    private String zona;
    
    //Metodos
    //Constructor
    public Repartidor(String nombre, int edad, float salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;  
    }
    
    //Setter
    public void setZona(String zona) {
        this.zona = zona;
    }
    
    //Getter
    public String getZona() {
        return zona;
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "\nZona: "+zona;
        
    }
    
    @Override
    public void plus() {
        if(super.getEdad() < 25 && zona == "3") {
            float nuevoSalario = super.getSalario() + super.getPlus();
            super.setSalario(nuevoSalario);
            System.out.println("Se añadio un PLUS al empleado "+super.getNombre());
        }
    }
}
