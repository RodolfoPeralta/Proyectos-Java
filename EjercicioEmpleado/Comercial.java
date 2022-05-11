
package paquete1;

public class Comercial extends Empleado {
    
    //Atributos
    private double comision;
    
    //Metodos
    //Constructor
    public Comercial(String nombre, int edad, float salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    //Setter
    public void setComision(double comision) {
        this.comision = comision;
    }
    
    //Getter
    public double getComision() {
        return comision;
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "\ncomision: "+comision;
        
    }
    
    @Override
    public void plus() {
        if( super.getEdad() > 30 && comision > 200) {
            float nuevoSalario = super.getSalario() + super.getPlus();
            super.setSalario(nuevoSalario);
            System.out.println("Se añadio un PLUS al empleado "+super.getNombre());
        }
    }
}
