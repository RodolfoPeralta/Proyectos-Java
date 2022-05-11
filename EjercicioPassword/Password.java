
package Paquete1;

public class Password {
    
    //Atributos
    private int longitud;
    private final String contraseña;
    
    //Metodos
    
    //Constructor por defecto, asigna la longitud en 8 caracteres
    public Password() {
        longitud = 8;
        contraseña = generarPassword();
    }
    
    //Constructor
    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword();
    }
    
    //Getters
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    //Setter
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public String generarPassword() {
        
        String contraseñas = "";
        
        for(int i=0; i<longitud; i++) {
            //Genero un nro aleatorio entre 1-3 para elegir entre las 3 opciones
            int eleccion = (int)Math.floor(Math.random()*3+1);
            
            //genero numeros aleatorios entre 0 y 9
            int numAleatorio=(int)Math.floor(Math.random()*(9-0)+0);
        
            //genero numero aleatorio entre 65-90 para despues convertirlo a caracter entre A-Z
            int caracterAleatorio=(int)Math.floor(Math.random()*(90-65)+65);
        
            //genero numero aleatorio entre 97-122 para despues convertirlo a caracter entre a-z
            int caracterAleatorio2=(int)Math.floor(Math.random()*(122-97)+97);
        
            char car1 = (char)caracterAleatorio;
            char car2 = (char)caracterAleatorio2;
            
            if(eleccion == 1) {
                contraseñas += numAleatorio;
            }
            if(eleccion == 2) {
                contraseñas += car1;
            }
            if(eleccion == 3) {
                contraseñas += car2;
            }
        }
        return contraseñas;
    }
    
    public boolean esFuerte() {
        int contMayus = 0, contMinus = 0, contNumeros = 0; boolean fuerte;
        
        for(int i=0; i<longitud; i++) {
            if(contraseña.charAt(i) >= 0 && contraseña.charAt(i) <= 9) {
                contNumeros++;
            }
            if(contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                contMayus++;
            }
            if(contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                contMinus++;
            }   
        }
        
        if(contNumeros > 5 && contMayus > 2 && contMinus >1) {
            fuerte = true;
        }
        else {
            fuerte = false;
        }
        
        return fuerte;
    }
}
