
package paquete1;


public abstract class Empleado {
    
    //Atributos
    private String nombre;
    private int edad;
    private float salario;
    private final float PLUS = 300;
    
    //Metodos
    //Constructor
    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }
    
    public float getPlus() {
        return PLUS;
    }
    
    
    @Override
    public String toString() {
        return "Nombre: "+nombre+
                "\nEdad: "+edad+" años"+
                "\nSalario: "+salario+" $";
    }
    
    public abstract void plus();
}
